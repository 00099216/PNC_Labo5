<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JPA</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="students">
		<label>Ingrese el codigo del estudiante que quiere revisar: </label>
		<form:input type="text" name="cStudent" path="cStudent"/>
		<br>
		<input type="submit" value="Buscar estudiante">
	</form:form>
</body>
</html>