package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAL {

	
	
	public List<Employee> getAllEmployees(){
		List<Employee> em=new ArrayList<>();
		try {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=pavan123";
		Connection conn = DriverManager.getConnection(url);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while (rs.next()) {
			em.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
		}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return em;
	}
	
	public int addEmployee(Employee e){
		System.out.println("asd");
		int i=-1;
		try {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=pavan123";
		Connection conn = DriverManager.getConnection(url);
		PreparedStatement st = conn.prepareStatement("insert into employee(empno,ename,job,salary) values(?,?,?,?)");
		st.setInt(1, e.getEmpno());
		st.setString(2,e.getEname());
		st.setString(3,e.getJob());
		st.setDouble(4, e.getSal());
		i=st.executeUpdate();

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return i;
	}
	
	public int editEmployee(Employee e){
		int i=-1;
		try {
			System.out.println("edit");
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=pavan123";
		Connection conn = DriverManager.getConnection(url);
		PreparedStatement st = conn.prepareStatement("update employee set ename=?,job=?,salary=? where empno=?");
		st.setString(1,e.getEname());
		st.setString(2,e.getJob());
		st.setDouble(3,e.getSal());
		st.setInt(4, e.getEmpno());
		i=st.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return i;
	}
	
	public int deleteEmployee(Employee e){
		int i=-1;
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=pavan123";
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement("delete from Employee where empno=?");
			st.setInt(1, e.getEmpno());
			i=st.executeUpdate();

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return i;
	}
}
