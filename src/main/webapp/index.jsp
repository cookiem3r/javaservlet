<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Our Super Duper Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Our Super Duper Form</h1>

		<form action="LoginServlet" method="GET">
			<div class="mb-3">
				<label for="userid" class="form-label">User ID:</label> <input
					class="form-control" type="text" name="id" size="20">
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password:</label>
				<input class="form-control" type="password" name="password" size="20">
			</div>

			<input class="btn btn-primary" type="submit" value="Submit">
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</body>
</html>