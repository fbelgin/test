<%@page import="java.util.List"%>
<%@page import="demo.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%List<Question> list = (List<Question>)session.getAttribute("qlist");%>

<% 
for(Question q : list)  {
%>

<%=q.getText() %>	
	
<% } %>
	
}
<h2>Your question saved !</h2>



</body>
</html>