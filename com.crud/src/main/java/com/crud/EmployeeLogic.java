package com.crud;

import java.util.List;

public class EmployeeLogic {
	
	int index=0;
	List<Employee> empList;
	EmployeeDAL el=new EmployeeDAL();
	public  boolean ClickLogic(String click) {
		
		boolean check=false;
		
		if("first".equals(click)||"next".equals(click)||"prev".equals(click)||"last".equals(click)) {
			check=true;
		}
		return check;
		
		
	}

	public Employee getEmployeeByClick(String click) {
		Employee emp=new Employee();
		empList=el.getAllEmployees();
		index=0;
		if("first".equals(click)) {
			index=0;
		}
		else if("next".equals(click)) {
			if(index<empList.size()-1) {
				index++;
			}
		}
		else if("prev".equals(click)) {
			if(index>0) {
				index--;
			}
		}
		else if("last".equals(click)) {
			index=empList.size()-1;
		}
		
		return empList.get(index);
	}
	
	public int EmployeeUpdate(Employee emp, String click) {

		int i=-1;
		
		if("delete".equals(click)) {
			i=el.deleteEmployee(emp);
		}
		else if("add".equals(click)) {
			i=el.addEmployee(emp);
		}
		else if("edit".equals(click)) {
			i=el.editEmployee(emp);
		}
		return i;
	}
}
