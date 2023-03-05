<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Matcher</title>
</head>
<body>

	<c:forEach items="${finalList}" var="team">
		${team}<br>
	</c:forEach>
	<form action="<%=request.getContextPath()%>/">
		<input type="submit" value="Back">
	</form>
</body>
</html>