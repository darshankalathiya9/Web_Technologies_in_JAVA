package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.StudentDao;
import Model.Student;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		System.out.println(action);

		if (action.equalsIgnoreCase("Register")) {
			Student student = new Student();
			student.setFirstName(request.getParameter("FirstName"));
			student.setLastName(request.getParameter("LastName"));
			student.setEmail(request.getParameter("Email"));
			student.setMobile(Long.parseLong(request.getParameter("Mobile")));
			student.setGender(request.getParameter("Gender"));
			student.setPassword(request.getParameter("Password"));
			System.out.println(student);

			StudentDao.insertStudent(student);
			request.setAttribute("msg", "Account Registerd Sucessfully.");
			request.getRequestDispatcher("Student-Login.jsp").forward(request, response);
		}

		else if (action.equalsIgnoreCase("Login")) {
			Student student = new Student();
			student.setEmail(request.getParameter("Email"));
			String Email = request.getParameter("Email");

			student.setPassword(request.getParameter("Password"));
			System.out.println(student);

			boolean flag = StudentDao.checkEmail(Email);
			System.out.println(flag);

			if (flag == true) {
				Student student2 = StudentDao.userLogin(student);
				if (student2 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", student2);
					request.getRequestDispatcher("Student-Home.jsp").forward(request, response);
				} else {
					request.setAttribute("incorrect", "Password is Incorrect.... ");
					request.getRequestDispatcher("Student-Login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg1", "Account Not Registered.");
				request.getRequestDispatcher("Student-Login.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("Edit")) {
			int ID = Integer.parseInt(request.getParameter("ID"));
			Student student = StudentDao.getUserByID(ID);

			request.setAttribute("data", student);
			request.getRequestDispatcher("Student-Update.jsp").forward(request, response);
		}

		else if (action.equalsIgnoreCase("Update")) {
			Student student = new Student();
			student.setId(Integer.parseInt(request.getParameter("ID")));
			student.setFirstName(request.getParameter("FirstName"));
			student.setLastName(request.getParameter("LastName"));
			student.setEmail(request.getParameter("Email"));
			student.setMobile(Long.parseLong(request.getParameter("Mobile")));
			student.setGender(request.getParameter("Gender"));
			student.setPassword(request.getParameter("Password"));

			StudentDao.updateUser(student);
			response.sendRedirect("Student-Home.jsp");
		}

		else if (action.equalsIgnoreCase("Delete")) {
			int ID = Integer.parseInt(request.getParameter("ID"));

			StudentDao.deleteStudent(ID);
			response.sendRedirect("Student-Home.jsp");
		}
	}
}
