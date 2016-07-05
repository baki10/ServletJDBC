<%@page import="com.bakigoal.util.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%User user = (User) session.getAttribute("User"); %>
<h3>Hi <%=user.getName() %></h3>
<strong>Your Email</strong>: <%=user.getEmail() %><br>
<strong>Your Country</strong>: <%=user.getCountry() %><br>
<br>
<form action="Logout" method="post">
    <input type="submit" value="Logout" >
</form>
<hr>
<form action="FileUploadServlet"
      enctype="multipart/form-data"
      method="POST">
    <input type="file" name="myFile"><br>
    <input type="Submit" value="Upload File"><br>
</form>
</body>
</html>
