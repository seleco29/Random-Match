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
	Total number of teams is ${totalTeamsNumber}
	<hr>
	<form action="teamsNameList" method="post">
		<c:forEach begin="1" var="temp" end="${totalTeamsNumber}">
			<label for="teamName">Enter name of team ${temp}</label>
			<input type="text" name="teamName" required="required">
			<br />
		</c:forEach>
		<input type="submit" value="Submit">
	</form>
	<form action="<%=request.getContextPath()%>/">
		<input type="submit" value="Back">
	</form>
</body>
</html>