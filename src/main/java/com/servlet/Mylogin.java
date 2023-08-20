package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Mylogin")
public class Mylogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
		PrintWriter pw = null; 
		  String name = "DEVELOPER";
		pw = resp.getWriter();
		  pw.println("<h1 style='text-align: center; color:blue'>"
	                 + "Hello "+ name + "</h1>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		PrintWriter pw = null; 
		  String name = "DEVELOPER";
		pw = resp.getWriter();
		  pw.println("<h1 style='text-align: center; color:blue'>"
	                 + "Hello "+ name + "</h1>");
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("ASASASASASAS");
	}
	

}
