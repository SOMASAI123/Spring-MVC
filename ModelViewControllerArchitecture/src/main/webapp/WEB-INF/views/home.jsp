<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>these is home page</h1>

<% String name=(String) request.getAttribute("name");
   int id=(int) request.getAttribute("id");
%>
<h1> hello,<%=name %> and your id is <%=id %></h1>
</body>
</html>