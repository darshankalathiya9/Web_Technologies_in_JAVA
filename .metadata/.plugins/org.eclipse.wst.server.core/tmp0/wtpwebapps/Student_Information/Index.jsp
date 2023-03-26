<%@page import="Model.Student"%>
<%@page import="Dao.StudentDao"%>
<%@page import="java.util.List"%>
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
						<!--  <li>
                            First Tier Drop Down
                            <label for="drop-2" class="toggle">Dropdown <span class="fa fa-angle-down" aria-hidden="true"></span>
                            </label>
                            <a href="#">Dropdown <span class="fa fa-angle-down" aria-hidden="true"></span></a>
                            <input type="checkbox" id="drop-2" />
                            <ul>
                                <li><a href="#team" class="drop-text">Professors</a></li>
                                <li><a href="#stats" class="drop-text">Statistics</a></li>
                                <li><a href="#test" class="drop-text">Reviews</a></li>
                            </ul>
                        </li> -->
						<li><a href="Student-Registration.jsp">Register</a></li>
						<li><a href="Student-Login.jsp">Login</a></li>
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
	</div>
	<!-- //main -->
	<!-- /entry -->
	<div class="entry-w3pvt-main py-5">
		<div class="container px-lg-5 py-md-3">
			<div class="entry-w3layouts-info">
				<h4>Best Online Learning Center</h4>
				<p>Maecenas quis neque libero. Class aptent taciti.Lorem ipsum
					dolor sit amet, consectetur adipiscing elit.Pellentesque convallis
					diam consequat magna vulputate malesuada. Cras a ornare elit. Nulla
					viverra pharetra sem, eget pulvinar neque pharetra ac.Pellentesque
					convallis diam consequat magna vulputate malesuada.</p>
			</div>
		</div>
	</div>
	<!-- //entry -->
	<!-- banner-bottom -->
	<section class="banner-bottom py-5" id="about">
		<div class="container py-md-4">
			<div class="row banner-grids">
				<div class="col-lg-6 content-right-bottom text-left">
					<img src="images/ab.jpg" alt="" class="img-fluid">
				</div>
				<div
					class="col-lg-6 content-left-bottom entry-w3layouts-info text-left pl-lg-4">
					<h5 class="mt-1">Online Education Learn skills online.</h5>
					<h4>Limitless learning, more possibilities</h4>
					<p class="mt-2 text-left">
						Integer pulvinar leo id viverra feugiat.<strong
							class="text-capitalize"> Pellentesque libero justo,
							semper at tempus vel, ultrices in sed ligula. Nulla uter
							sollicitudin velit.</strong> Sed porttitor orci vel fermentum elit
						maximus. Curabitur ut turpis massa in condimentum libero.
						Pellentesque maximus Pellentesque libero justo Nulla uter
						sollicitudin velit. Sed porttitor orci vel ferm semper at vel,
						ultrices in ligula semper at vel.Curabitur ut turpis massa in
						condimentum libero.
					</p>

				</div>

			</div>
		</div>
	</section>
	<!-- //banner-bottom -->
	<!-- /team-content -->
	<section class="team-content py-5" id="team">
		<div class="container py-md-4 text-center">
			<h3 class="tittle-w3layouts two">Experienced Professors</h3>
			<div class="row team-grids text-center mt-md-5 mt-4">
				<div class="col-lg-4 team-main">

					<div class="team-img">
						<img src="images/t1.jpg" alt="news image" class="img-fluid">
					</div>
					<div class="team-info">

						<h4>Chester Roberson</h4>
						<small>Associate Professor</small>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing eiusmod
							tempor incididunt ut labore et dolore magna.</p>
					</div>


				</div>

				<div class="col-lg-4 team-main">
					<div class="team-info">

						<h4>Maude Collier</h4>
						<small>Assistant Instructor</small>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing eiusmod
							tempor incididunt ut labore et dolore magna.</p>
					</div>

					<div class="team-img">
						<img src="images/t2.jpg" alt="news image" class="img-fluid">
					</div>


				</div>

				<div class="col-lg-4 team-main">

					<div class="team-img">
						<img src="images/t3.jpg" alt="news image" class="img-fluid">
					</div>
					<div class="team-info">

						<h4>Hunter Duncan</h4>
						<small>Assistant Instructor</small>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing eiusmod
							tempor incididunt ut labore et dolore magna.</p>
					</div>


				</div>

			</div>

		</div>
	</section>
	<!-- //team-content -->
	<!-- banner-bottom -->
	<section class="banner-bottom py-5" id="exp">
		<div class="container py-md-4">
			<h3 class="tittle-w3layouts two text-center">Live the experience</h3>
			<div class="row mid-grids mt-5">
				<div class="col-md-5 content-w3pvt-img">
					<img src="images/n1.jpg" alt="" class="img-fluid">
				</div>
				<div
					class="col-md-7 content-left-bottom entry-w3layouts-info text-left mt-3">
					<h5 class="mt-1">You Can Learn Anything</h5>
					<h4>Learn at your own pace</h4>
					<p class="mt-2 text-left">
						Integer pulvinar leo id viverra feugiat.<strong
							class="text-capitalize"> Pellentesque libero justo,
							semper at tempus vel, ultrices in sed ligula. Nulla uter
							sollicitudin velit.</strong> Sed porttitor orci vel fermentum elit
						maximus. Curabitur ut turpis massa in condimentum libero.
						Pellentesque maximus Pellentesque libero justo Nulla uter
						sollicitudin velit. Sed porttitor orci vel ferm semper at vel,
						ultrices in ligula semper at vel.Curabitur ut turpis massa in
						condimentum libero.
					</p>

				</div>

			</div>
			<div class="row mid-grids my-lg-5 py-lg-5">

				<div
					class="col-md-7 content-left-bottom entry-w3layouts-info text-left mt-3">
					<h5 class="mt-1">You Can Learn Anything</h5>
					<h4>Community of opportunities</h4>
					<p class="mt-2 text-left">
						Integer pulvinar leo id viverra feugiat.<strong
							class="text-capitalize"> Pellentesque libero justo,
							semper at tempus vel, ultrices in sed ligula. Nulla uter
							sollicitudin velit.</strong> Sed porttitor orci vel fermentum elit
						maximus. Curabitur ut turpis massa in condimentum libero.
						Pellentesque maximus Pellentesque libero justo Nulla uter
						sollicitudin velit. Sed porttitor orci vel ferm semper at vel,
						ultrices in ligula semper at vel.Curabitur ut turpis massa in
						condimentum libero.
					</p>

				</div>
				<div class="col-md-5 content-w3pvt-img">
					<img src="images/n2.jpg" alt="" class="img-fluid">
				</div>

			</div>
			<div class="row mid-grids">
				<div class="col-md-5 content-w3pvt-img">
					<img src="images/n3.jpg" alt="" class="img-fluid">
				</div>
				<div
					class="col-md-7 content-left-bottom entry-w3layouts-info text-left mt-3">
					<h5 class="mt-1">You Can Learn Anything</h5>
					<h4>Official certificate</h4>
					<p class="mt-2 text-left">
						Integer pulvinar leo id viverra feugiat.<strong
							class="text-capitalize"> Pellentesque libero justo,
							semper at tempus vel, ultrices in sed ligula. Nulla uter
							sollicitudin velit.</strong> Sed porttitor orci vel fermentum elit
						maximus. Curabitur ut turpis massa in condimentum libero.
						Pellentesque maximus Pellentesque libero justo Nulla uter
						sollicitudin velit. Sed porttitor orci vel ferm semper at vel,
						ultrices in ligula semper at vel.Curabitur ut turpis massa in
						condimentum libero.
					</p>

				</div>

			</div>
		</div>
	</section>
	<!-- //banner-bottom -->
	<!--/last-content-->
	<section class="last-content text py-5">
		<div class="container py-md-3 text-center">
			<div class="last-w3pvt-inner-content px-lg-5">
				<h3 class="mb-4 tittle-w3layouts">
					Get started with <span>Online </span> Education !
				</h3>
				<p class="px-lg-5">Sed ut perspiciatis unde omnis natus error
					dolor volup tatem ed accus antium dolor emque laudantium, totam rem
					aperiam, eaqu ipsa quae ab illo quasi architi ecto beatae vitae
					dicta sunt dolor ipsum.</p>
				<div class="buttons mt-md-4 mt-3">
					<a href="apply.html" class="btn btn-default">Get Started</a> <a
						href="apply.html" class="btn btn1"> Join Event </a>
				</div>
			</div>
		</div>
	</section>
	<!--//last-content-->
	<section class="ab-info-main py-5">
		<div class="container py-md-4">
			<h3 class="tittle-w3layouts two text-center">Available Courses</h3>
			<div id="products" class="row view-group my-lg-5 my-4">
				<div class="item col-lg-4 mt-3">
					<div class="thumbnail card">
						<div class="img-event">
							<img class="group list-group-image img-fluid" src="images/g1.jpg"
								alt="">
						</div>
						<div class="caption card-body">
							<h4 class="group card-title inner list-group-item-heading">
								Programming</h4>
							<p class="group inner list-group-item-text">Lorem ipsum dolor
								sit amet consectetuer, consectetuer adipiscing elit sit</p>
						</div>
					</div>
				</div>
				<div class="item col-lg-4 mt-3">
					<div class="thumbnail card">
						<div class="img-event">
							<img class="group list-group-image img-fluid" src="images/g2.jpg"
								alt="">
						</div>
						<div class="caption card-body">
							<h4 class="group card-title inner list-group-item-heading">
								Art &amp; Design</h4>
							<p class="group inner list-group-item-text">Lorem ipsum dolor
								sit amet consectetuer, consectetuer adipiscing elit sit</p>
						</div>
					</div>
				</div>
				<div class="item col-lg-4 mt-3">
					<div class="thumbnail card">
						<div class="img-event">
							<img class="group list-group-image img-fluid" src="images/g3.jpg"
								alt="">
						</div>
						<div class="caption card-body">
							<h4 class="group card-title inner list-group-item-heading">
								Languages</h4>
							<p class="group inner list-group-item-text">Lorem ipsum dolor
								sit amet consectetuer, consectetuer adipiscing elit sit</p>
						</div>
					</div>
				</div>

			</div>
			<div class="row text-center mt-lg-5 mt-4 pt-5" id="stats">
				<div class="col-sm-4">
					<div class="counter">
						<h3 class="count-title">1500</h3>
						<p class="count-text ">Support</p>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="counter two">
						<h3 class="count-title">1700</h3>
						<p class="count-text ">Happy Hours</p>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="counter">
						<h3 class="count-title">11900</h3>
						<p class="count-text ">Project Complete</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--//-->
	<!--/testimonials-->
	<section class="testimonials py-5" id="test">
		<div class="container py-3">
			<h3 class="tittle-w3layouts text-center mt-3">See what people
				are saying</h3>
			<div class="testimonials_grid mx-auto text-center row px-lg-5 mt-5">

				<div class="col-md-3 testi_grid text-md-center">
					<img src="images/test.jpg" alt=" " class="img-fluid">
				</div>
				<div class="col-md-9 testi_grid text-left">
					<span class="fa fa-quote-left" aria-hidden="true"></span>
					<p class="sub-test pr-lg-5">Integer sit amet mattis quam, sit
						amet ultricies velit. Nam libero tempore, cum soluta nobis est
						eligendi optio cumque nihil impedit quo minus id quod possimus,
						omnis voluptas.
					<h5>Thomas Carl</h5>
				</div>
			</div>
		</div>
	</section>
	<!--//testimonials-->
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