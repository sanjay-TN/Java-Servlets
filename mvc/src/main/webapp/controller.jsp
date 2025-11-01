<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String pagename=request.getParameter("page");
	if(pagename.equals("java"))
	{
		response.sendRedirect("java.jsp");
	}
	else if(pagename.equals("javascript"))
	{
		response.sendRedirect("javascript.jsp");
	}
	
	%>

</body>
</html>