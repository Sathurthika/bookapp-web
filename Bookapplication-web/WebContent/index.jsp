
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>
	<form action="BookController">

		Name:<input type="text" name="book_name" /><br> 
		Price:<input type="text" name="book_price" />
		<button type="submit">Save</button>
	</form>
</body>
</html>
