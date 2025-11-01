package com.servletClass;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/message")
public class message extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int sum=n1+n2;
		/* Request Dispatcher [it has ignore and forward method]
	
		req.setAttribute("k", sum); 
		RequestDispatcher rd=req.getRequestDispatcher("add");
		rd.include(req, res);
		
		*/
//		redirect
//		res.sendRedirect("add?k="+sum);
		
//		cookie
		Cookie cookie=new Cookie("k","123");
		res.addCookie(cookie);
		
	}

}
