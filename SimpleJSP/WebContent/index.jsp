<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%!		String contenu[] = {"Raoul", "JeanValJean", "Bobbby"};

%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The very good Titre</title>
</head>
<body>

Bonjour à tous, nous sommes le <%= new java.util.Date().toString() %>
<br> 

<table> 

<td>
<%

response.setContentType("text/html"); 

    for(int i = 0; i < contenu.length; i++)
    {%> <tr>   <%
    	
       out.println("Le nom " + ((String)contenu[i]) + " est numéro " + String.valueOf(i + 1) );
     %> </tr> <br> <%   }%>   

</td>
</table>


<c:set var="content">Raoul,Jeannot ,Coucou</c:set>

<c:forTokens items="${content}" delims="," var="Names">
    ${Names} 
   
</c:forTokens>


</body>
</html>