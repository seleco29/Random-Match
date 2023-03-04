<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Matcher</title>
</head>
<body>
	<form action="totalTeamsForm">
		<label for="totalTeams">Enter total number of teams</label> 
		<input type="number" name="totalTeams" max="20" min="2" required="required"> 
		<input type="submit" value="Submit">
	</form>
</body>
</html>