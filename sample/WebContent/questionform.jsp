<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-9))"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Question Form</title>
</head>
<body>


<%String name = "abc";
SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
Date sysdate = new Date();
//String message ="Hello " + name.toUpperCase() + " " + df.format(sysdate);
//String m ="Hello " + name.toUpperCase();
%>
</br>
<%=df.format(sysdate)%>

<h1>Ask Me a Question</h1>
<form action="/sample/question" method="POST">
<!--Question Detail: <input type ="text" name ="text"> <br/>  -->
Title <input type ="text" name ="title"> <br/> <br/> 
Text  <br/> <br/> <textarea name="text" rows="5" cols="20"> </textarea> <br/> <br/>
Score <br/> <br/> <select name="select" size=1>
  <option value="1">  1</option> 
  <option value="2">  2</option>
  <option value="3">  3</option>
  <option value="4">  4</option>
  <option value="5">  5</option>
  </select> <br/> <br/>
<input type = "submit" value ="OK">
</form>
</body>
</html>