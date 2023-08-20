package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	   public void doGet(HttpServletRequest req, HttpServletResponse res) 
	               throws ServletException, IOException {
		  PrintWriter pw = null; 
		  String name = "ASAD";
		pw = res.getWriter();
		  pw.println("<h1 style='text-align: center; color:blue'>"
	                 + "Hello "+ name + "</h1>");
		  pw.println(" <a href=\"Mylogin\"> Login </a>");
		 
	
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("HELLLLLLLLLLLLLO");
	}
	
}
