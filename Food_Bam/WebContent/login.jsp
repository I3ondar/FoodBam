<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FoodBam.com: Online Organic Food Source</title>

<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<table>
	<td>
	<img src="Images/foodbamLogo.png" width="270px" height="270px">
	</td>
	<td width="100%" style="font-size: 100px; color: white">
		<marquee scrollamount="11" scrolldelay="2">
			<em><strong>"The key to healthy living is living healthy."</strong></em>
		</marquee>
	</td>
</table>

<table>
<div id="navbar">
<ul>
   <li><a href="login.jsp">Log In</a></li>
   <li><a href="createAcct.jsp">Create Account</a></li>
   <li class="has-sub"><a href="#">About Us</a>
      <ul>
         <li class="has-sub"><a href="michaelVB.html">Michael Van Buren</a></li>
         <li class="has-sub"><a href="ioanaB.html">Ioana Bondar</a></li>
         <li class="has-sub"><a href="dannyN.html">Danny Nguyen</a></li>
      </ul>
   </li>
   <li><a href="cart.jsp">Cart</a></li>
   <li><a href="product.jsp">Products</a></li>
   <li><a href="index.jsp">Home</a></li>
</ul>
</div>
</table>

<form id="loginForm" action="Login" method="POST">
	<h1>Log In</h1>
	<input type="text" name="username" placeholder="Username" required><br>
	<input type="password" name="password" placeholder ="Password" required><br>
	<input type="submit" value="Login"><br>
	${errorMessage}
</form>



</body>
</html>