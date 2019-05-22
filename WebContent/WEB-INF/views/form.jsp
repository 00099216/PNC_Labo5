<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Busqueda</title>
</head>
<body>
<h1>${message}</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Status</th>
		</tr>
	
			<tr>
				<td>${students.sName}</td>
				<td>${students.lName}</td>
				<td>${students.sAge}</td>
				<td>${students.activoDelegate}</td>
			</tr>

	</table>

</body>
</html>