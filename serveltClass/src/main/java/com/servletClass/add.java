package com.servletClass;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		/*request dispatcher
		
		int a=(int)req.getAttribute("k");
		PrintWriter out=res.getWriter();
		out.print("second servlet " + a);
		*/
//		redirect
//		System.out.println("second servlet");
		int num=Integer.parseInt(req.getParameter("k"));
		int sq=num*num;
		PrintWriter out=res.getWriter();
		out.print("square = "+ sq);
	}

}
