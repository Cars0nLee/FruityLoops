<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="fruitInfo" items="${fruits}">
			<tr>
		 		<th><c:out value="${fruitInfo.name}" /></th>
		 		<th>$<c:out value="${fruitInfo.price}" /></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
