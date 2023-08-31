package com.crud;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String job=request.getParameter("job");
		double sal=Double.parseDouble(request.getParameter("sal"));
		String click=request.getParameter("click");
		
		Employee emp=new Employee(id,name,job,sal);
		System.out.println("ser");
		EmployeeLogic el=new EmployeeLogic();
		EmployeeDAL empd=new EmployeeDAL();
		
		boolean check=el.ClickLogic(click);
		System.out.println(check);
		List<Employee> ls=empd.getAllEmployees();
		
		Employee em=ls.get(0);
		if(check) {
			System.out.println("asd1");
			em=el.getEmployeeByClick(click);
		}
		else {
			System.out.println("as21");
			el.EmployeeUpdate(emp, click);
		}
		request.setAttribute("emp",em);
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	
	}

}
