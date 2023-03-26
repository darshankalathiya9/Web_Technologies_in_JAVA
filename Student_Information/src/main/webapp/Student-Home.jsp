<%@page import="Dao.StudentDao"%>
<%@page import="java.util.List"%>
<%@page import="Model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Provision Education</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8" />
<meta name="keywords"
	content="Provision Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- font-awesome icons -->
<link href="css/font-awesome.min.css" rel="stylesheet">
<!-- //Custom Theme files -->
<!-- online-fonts -->
<link
	href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i"
	rel="stylesheet">
<!-- //online-fonts -->
</head>

<body>

	<%
	Student s = null;
	if (session.getAttribute("data") != null) {
		s = (Student) session.getAttribute("data");
	} else {
		response.sendRedirect("Student-Login.jsp");
	}
	%>


	<!-- main -->
	<div class="main-content" id="home">
		<!-- header -->
		<header>
			<div class="container-fluid">
				<!-- nav -->
				<nav class="py-md-4 py-3 d-lg-flex nav_w3pvt">
					<div id="logo">
						<h1>
							<a href="Index.jsp">Provision</a>
						</h1>
					</div>
					<label for="drop" class="toggle"><span class="fa fa-bars"></span></label>
					<input type="checkbox" id="drop" />
					<ul class="menu mt-lg-3 ml-auto">
						<li class="active"><a href="Index.jsp">Home</a></li>
						<li><a href="about.html">About Us</a></li>
						<li><a href="#exp">Experience</a></li>
						<li><a href="course.html" class="drop-text">Courses</a></li>
						<li><a href="Student-Home.jsp"><%=s.getFirstName() %></a></li>
						<li><a href="Student-Logout.jsp">Logout</a></li>
						<li>
							<p class="w3pvt-phone">
								<span class="fa fa-phone mr-2"></span>+91 12345 67890
							</p>
						</li>
					</ul>
				</nav>
				<!-- //nav -->
			</div>
		</header>
		<!-- //header -->

		<!-- banner -->
		<div class="banner-content-w3pvt">
			<div class="banner-w3layouts-info text-center">
				<h3>Any successful career starts with a good Education</h3>
				<form class="banner-form" method="post" action="#">
					<input type="email" class="form-control" id="Email"
						placeholder="Enter your email..." name="Email" required="">
					<button type="submit" class="btn btn-default">Get Started</button>
				</form>
			</div>
		</div>

		<!-- //banner -->
	</div><br><br>
	<!-- //main -->
	
	<div class="container">
		<h2 class="text-center">Student Data</h2>
		<br>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Gender</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<%List<Student> list = StudentDao.getAllStudents(); %>
			<tbody>
			<%for (Student s1 : list){ %>
					<tr>
						<th><%=s1.getID() %></th>
						<th><%=s1.getFirstName() %></th>
						<th><%=s1.getLastName() %></th>
						<th><%=s1.getEmail() %></th>
						<th><%=s1.getMobile() %></th>
						<th><%=s1.getGender() %></th>
						<th><%=s1.getPassword() %></th>
						<th>
							<form action="StudentController" method="post">
								<input type="hidden" name="ID" value=<%=s1.getID() %>>
								<input type="submit" name="action" value="Edit">
							</form>
						</th>
						<th>
							<form action="StudentController" method="post">
								<input type="hidden" name="ID" value=<%=s1.getID() %>>
								<input type="submit" name="action" value="Delete">
							</form>
						</th>
					</tr>
			<%} %>
			</tbody>
		</table>
	</div>
	<br><br>
	
	
	<!-- footer -->
	<footer class="footer-content text-center py-5">
		<div class="container py-md-3">
			<!-- logo -->
			<h2 class="logo2 text-center">
				<a href="index.html"> Provision </a>
			</h2>
			<!-- //logo -->
			<!-- address -->
			<div class="contact-left-footer mt-md-4">
				<ul>
					<li>
						<p>
							<span class="fa fa-map-marker mr-2"></span>Somewhere on Earth
						</p>
					</li>
					<li class="mx-4">
						<p>
							<span class="fa fa-phone mr-2"></span>+91 12345 67890
						</p>
					</li>
					<li>
						<p class="text-wh">
							<span class="fa fa-envelope-open mr-2"></span> <a
								href="mailto:dkwebdeveloper9@gmail.com">dkwebdeveloper9@gmail.com</a>
						</p>
					</li>
				</ul>
			</div>
			<!-- //address -->
			<!-- social icons -->
			<div class="footer-w3pvt-copy-social my-4">
				<ul>
					<li><a href="#"> <span class="fa fa-facebook-square"></span>
					</a></li>
					<li class="mx-2"><a href="#"> <span
							class="fa fa-twitter-square"></span>
					</a></li>
					<li class=""><a href="#"> <span
							class="fa fa-google-plus-square"></span>
					</a></li>
					<li class="mx-2"><a href="#"> <span
							class="fa fa-linkedin-square"></span>
					</a></li>
					<li><a href="#"> <span class="fa fa-rss-square"></span>
					</a></li>
					<li class="ml-2"><a href="#"> <span
							class="fa fa-pinterest-square"></span>
					</a></li>
				</ul>
			</div>
			<!-- //social icons -->
			<!-- copyright -->
			<div class="w3layouts-copy text-center">
				<p class="text-da">© 2023 Provision. All rights reserved |
					Design by DK</p>
			</div>
			<!-- //copyright -->
			<!-- move top icon -->
			<div class="move-top text-center mt-3">
				<a href="#home" class="move-top"><span
					class="fa fa-angle-double-up" aria-hidden="true"></span></a>
			</div>
			<!-- //move top icon -->
		</div>
	</footer>
	<!-- //footer -->
</body>
</html>