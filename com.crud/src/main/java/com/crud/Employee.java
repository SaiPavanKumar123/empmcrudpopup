package com.crud;

public class Employee {
	private int Empno;
	private String ename;
	private String job;
	private double sal;


	public Employee(int empno, String ename, String job, double sal) {
		
		this.Empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpno() {
		return Empno;
	}


	public void setEmpno(int empno) {
		Empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Empno" + Empno + ", Ename" + ename + ", Job" + job + ", Salary" + sal;
	}

}