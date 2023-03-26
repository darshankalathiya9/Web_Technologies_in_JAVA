package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.DBConnection;
import Model.Student;

public class StudentDao {
	public static void insertStudent(Student s) {
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "insert into student (FirstName,LastName,Email,Mobile,Gender,Password) values (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, s.getFirstName());
			pst.setString(2, s.getLastName());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());

			pst.executeUpdate();
			System.out.println("Data Inserted Succesfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String Email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "select * from student where Email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, Email);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Student userLogin(Student s) {
		Student student = null;
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "select * from student where Email = ? and Password=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("ID"));
				student.setFirstName(rs.getString("FirstName"));
				student.setLastName(rs.getString("LastName"));
				student.setEmail(rs.getString("Email"));
				student.setMobile(rs.getLong("Mobile"));
				student.setGender(rs.getString("Gender"));
				student.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	public static List<Student> getAllStudents() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "select * from student";
			PreparedStatement pst = conn.prepareStatement(sql);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("ID"));
				student.setFirstName(rs.getString("FirstName"));
				student.setLastName(rs.getString("LastName"));
				student.setEmail(rs.getString("Email"));
				student.setMobile(rs.getLong("Mobile"));
				student.setGender(rs.getString("Gender"));
				student.setPassword(rs.getString("Password"));
				list.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Student getUserByID(int ID) {
		Student student = null;
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "select * from student where ID = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, ID);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				student = new Student();
				student.setId(rs.getInt("ID"));
				student.setFirstName(rs.getString("FirstName"));
				student.setLastName(rs.getString("LastName"));
				student.setEmail(rs.getString("Email"));
				student.setMobile(rs.getLong("Mobile"));
				student.setGender(rs.getString("Gender"));
				student.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	public static void updateUser(Student s) {
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "update student set FirstName=?, LastName=?,";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, s.getFirstName());
			pst.setString(2, s.getLastName());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getGender());
			pst.setString(6, s.getPassword());

			pst.executeUpdate();
			System.out.println("Data Updated Sucessfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteStudent(int Id) {
		try {
			Connection conn = DBConnection.createconnection();
			String sql = "delete from student where ID = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, Id);
			pst.executeUpdate();
			System.out.println("Data Deleted Sucessfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}