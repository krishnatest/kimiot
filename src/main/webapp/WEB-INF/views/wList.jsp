<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="/bootstrap.css" />
    <link rel="stylesheet" href="/style.css" />
	<title>spring-microservices: Weather Api</title>
</head>

<body>

	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse" style="background-color: #666; margin-top:10px;">
				<div class="container-fluid">
					<div class="navbar-header" style="text-align: left; color:#FFFFFF; margin-bottom:10px;">
						<h2>Weather Microservice</h2>
					</div>
				</div>
			</nav>
		</div>
		
		<div class="row" style="text-align: left">
			<h2>Json</h2>
			
			<table width="600px">
				<!-- 
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.usersFname}</td>
						<td>${user.usersLname}</td>
						<td>${user.mobile}</td>
						<td>${user.address}</td>
						<td><a href="/updateUsers">${user.usersShortId}</a></td>
					</tr>
				</c:forEach>
				-->
				
				<tr>
					<td>
						${jData}
					</td>
				</tr>
				
			</table>
		</div>
	</div>

</body>

</html>