/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-03-26 11:55:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.StudentDao;
import java.util.List;
import Model.Student;

public final class Student_002dHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Dao.StudentDao");
    _jspx_imports_classes.add("Model.Student");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Provision Education</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Provision Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\r\n");
      out.write("<script>\r\n");
      out.write("	addEventListener(\"load\", function() {\r\n");
      out.write("		setTimeout(hideURLbar, 0);\r\n");
      out.write("	}, false);\r\n");
      out.write("\r\n");
      out.write("	function hideURLbar() {\r\n");
      out.write("		window.scrollTo(0, 1);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"\r\n");
      out.write("	media=\"all\">\r\n");
      out.write("<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //Custom Theme files -->\r\n");
      out.write("<!-- online-fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- //online-fonts -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

	Student s = null;
	if (session.getAttribute("data") != null) {
		s = (Student) session.getAttribute("data");
	} else {
		response.sendRedirect("Student-Login.jsp");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- main -->\r\n");
      out.write("	<div class=\"main-content\" id=\"home\">\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		<header>\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<!-- nav -->\r\n");
      out.write("				<nav class=\"py-md-4 py-3 d-lg-flex nav_w3pvt\">\r\n");
      out.write("					<div id=\"logo\">\r\n");
      out.write("						<h1>\r\n");
      out.write("							<a href=\"Index.jsp\">Provision</a>\r\n");
      out.write("						</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("					<label for=\"drop\" class=\"toggle\"><span class=\"fa fa-bars\"></span></label>\r\n");
      out.write("					<input type=\"checkbox\" id=\"drop\" />\r\n");
      out.write("					<ul class=\"menu mt-lg-3 ml-auto\">\r\n");
      out.write("						<li class=\"active\"><a href=\"Index.jsp\">Home</a></li>\r\n");
      out.write("						<li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("						<li><a href=\"#exp\">Experience</a></li>\r\n");
      out.write("						<li><a href=\"course.html\" class=\"drop-text\">Courses</a></li>\r\n");
      out.write("						<li><a href=\"Student-Home.jsp\">");
      out.print(s.getFirstName() );
      out.write("</a></li>\r\n");
      out.write("						<li><a href=\"Student-Logout.jsp\">Logout</a></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<p class=\"w3pvt-phone\">\r\n");
      out.write("								<span class=\"fa fa-phone mr-2\"></span>+91 12345 67890\r\n");
      out.write("							</p>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("				<!-- //nav -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</header>\r\n");
      out.write("		<!-- //header -->\r\n");
      out.write("\r\n");
      out.write("		<!-- banner -->\r\n");
      out.write("		<div class=\"banner-content-w3pvt\">\r\n");
      out.write("			<div class=\"banner-w3layouts-info text-center\">\r\n");
      out.write("				<h3>Any successful career starts with a good Education</h3>\r\n");
      out.write("				<form class=\"banner-form\" method=\"post\" action=\"#\">\r\n");
      out.write("					<input type=\"email\" class=\"form-control\" id=\"Email\"\r\n");
      out.write("						placeholder=\"Enter your email...\" name=\"Email\" required=\"\">\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-default\">Get Started</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- //banner -->\r\n");
      out.write("	</div><br><br>\r\n");
      out.write("	<!-- //main -->\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2 class=\"text-center\">Student Data</h2>\r\n");
      out.write("		<br>\r\n");
      out.write("		<table class=\"table\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>ID</th>\r\n");
      out.write("					<th>FirstName</th>\r\n");
      out.write("					<th>LastName</th>\r\n");
      out.write("					<th>Email</th>\r\n");
      out.write("					<th>Mobile</th>\r\n");
      out.write("					<th>Gender</th>\r\n");
      out.write("					<th>Password</th>\r\n");
      out.write("					<th>Edit</th>\r\n");
      out.write("					<th>Delete</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			");
List<Student> list = StudentDao.getAllStudents(); 
      out.write("\r\n");
      out.write("			<tbody>\r\n");
      out.write("			");
for (Student s1 : list){ 
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>");
      out.print(s1.getID() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getFirstName() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getLastName() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getEmail() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getMobile() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getGender() );
      out.write("</th>\r\n");
      out.write("						<th>");
      out.print(s1.getPassword() );
      out.write("</th>\r\n");
      out.write("						<th>\r\n");
      out.write("							<form action=\"StudentController\" method=\"post\">\r\n");
      out.write("								<input type=\"hidden\" name=\"ID\" value=");
      out.print(s1.getID() );
      out.write(">\r\n");
      out.write("								<input type=\"submit\" name=\"action\" value=\"Edit\">\r\n");
      out.write("							</form>\r\n");
      out.write("						</th>\r\n");
      out.write("						<th>\r\n");
      out.write("							<form action=\"StudentController\" method=\"post\">\r\n");
      out.write("								<input type=\"hidden\" name=\"ID\" value=");
      out.print(s1.getID() );
      out.write(">\r\n");
      out.write("								<input type=\"submit\" name=\"action\" value=\"Delete\">\r\n");
      out.write("							</form>\r\n");
      out.write("						</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("			");
} 
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	<br><br>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- footer -->\r\n");
      out.write("	<footer class=\"footer-content text-center py-5\">\r\n");
      out.write("		<div class=\"container py-md-3\">\r\n");
      out.write("			<!-- logo -->\r\n");
      out.write("			<h2 class=\"logo2 text-center\">\r\n");
      out.write("				<a href=\"index.html\"> Provision </a>\r\n");
      out.write("			</h2>\r\n");
      out.write("			<!-- //logo -->\r\n");
      out.write("			<!-- address -->\r\n");
      out.write("			<div class=\"contact-left-footer mt-md-4\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<p>\r\n");
      out.write("							<span class=\"fa fa-map-marker mr-2\"></span>Somewhere on Earth\r\n");
      out.write("						</p>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"mx-4\">\r\n");
      out.write("						<p>\r\n");
      out.write("							<span class=\"fa fa-phone mr-2\"></span>+91 12345 67890\r\n");
      out.write("						</p>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<p class=\"text-wh\">\r\n");
      out.write("							<span class=\"fa fa-envelope-open mr-2\"></span> <a\r\n");
      out.write("								href=\"mailto:dkwebdeveloper9@gmail.com\">dkwebdeveloper9@gmail.com</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //address -->\r\n");
      out.write("			<!-- social icons -->\r\n");
      out.write("			<div class=\"footer-w3pvt-copy-social my-4\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-facebook-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"mx-2\"><a href=\"#\"> <span\r\n");
      out.write("							class=\"fa fa-twitter-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"\"><a href=\"#\"> <span\r\n");
      out.write("							class=\"fa fa-google-plus-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"mx-2\"><a href=\"#\"> <span\r\n");
      out.write("							class=\"fa fa-linkedin-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a href=\"#\"> <span class=\"fa fa-rss-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li class=\"ml-2\"><a href=\"#\"> <span\r\n");
      out.write("							class=\"fa fa-pinterest-square\"></span>\r\n");
      out.write("					</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //social icons -->\r\n");
      out.write("			<!-- copyright -->\r\n");
      out.write("			<div class=\"w3layouts-copy text-center\">\r\n");
      out.write("				<p class=\"text-da\">© 2023 Provision. All rights reserved |\r\n");
      out.write("					Design by DK</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //copyright -->\r\n");
      out.write("			<!-- move top icon -->\r\n");
      out.write("			<div class=\"move-top text-center mt-3\">\r\n");
      out.write("				<a href=\"#home\" class=\"move-top\"><span\r\n");
      out.write("					class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- //move top icon -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- //footer -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}