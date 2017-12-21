<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
<link href="../css/main.css" rel="stylesheet" type="text/css">

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link href="<c:url value="/src/css/main.css" />" rel="stylesheet">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form name = "MyForm" action="action_page.php" method="post">
Login: <input type="text" name="Login" value=""><br>
Password: <input type="password" name="PassWord" value=""><br>
<input type="submit" value="Submit" >
</form>


</body>
</html>