<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/login" var="login" />
	<div align="center">
		<h3>
			<form:form action="${login}">
Enter User Id:<input type="text" name="username" />
				<br />
				<br />
Enter Password:<input type="password" name="password" />
				<br />
				<br />
				<input type="submit" value="Submit" />
			</form:form>
		</h3>
	</div>
</body>
</html>