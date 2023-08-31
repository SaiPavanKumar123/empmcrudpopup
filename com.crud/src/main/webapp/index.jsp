<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.crud.Employee" %>
    <%Employee emp=(Employee)request.getAttribute("emp"); 
    %>
    <%if(emp==null){
    	emp=new Employee();
    	emp.setEmpno(01);
    	emp.setEname("Pavan");
    	emp.setJob("software");
    	emp.setSal(10000);%>
  <% }%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

	<title>Employee Crud Operations</title>
	<style>
		button{
			margin-left: 20px;
		}
		
		.popup {
  display: none;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
}

		
	</style>
</head>

<body><center>
	<form style="width: 70%;" action="http://localhost:9010/com.crud/EmployeeServlet" method="get">
	<h1 align="center">Crud Operations</h1><br><br><br>
	<label for="id">Employee Id </label><input type="number" id="id" name="id" value="<%=emp.getEmpno()%>"><br><br><br>
	<label for="name">Employee Name </label><input type="text" id="name" name="name" value="<%=emp.getEname()%>"><br><br><br>
	<label for="job">Job</label> <input type="text" id="job" name="job" value="<%=emp.getJob()%>"><br><br><br>
	<label for="sal">Salary</label><input type="text" id="sal" name="sal" value="<%=emp.getSal()%>"><br><br><br><br><br>
	<button id="first" class="btn btn-primary" name="click" value="first">First</button>
	<button id="Next" class="btn btn-primary" name="click" value="next">Next</button>
	<button id="last" class="btn btn-primary" name="click" value="last">Last</button>
	<button id="prev" class="btn btn-primary" name="click" value="prev">Prev</button>
	<button id="del" class="btn btn-primary" name="click" value="delete">Delete</button>
	<button id="clear" class="btn btn-primary" name="click" value="first">Clear</button>
	
	
	
	
</form>
<button id="Add" class="btn btn-primary" name="click" onclick="add()">Add</button>
<button id="edit" class="btn btn-primary" name="click" onclick="edit()">Edit</button>
</center>
<script>
	document.getElementById("id").readOnly=true;
	document.getElementById("name").readOnly=true;
	document.getElementById("job").readOnly=true;
	document.getElementById("sal").readOnly=true;
	
	
	function add() {
						var popup = window.open('http://localhost:9010/com.crud/EmployeePopServlet?click=add', 'Popup',
								'width=600,height=600');

						
					}
			function edit() {
				const id=document.getElementById("id").value;
				const name=document.getElementById("name").value;
				const job=document.getElementById("job").value;
				const sal=document.getElementById("sal").value;
				
				var url="http://localhost:9010/com.crud/EmployeePopServlet?click=edit&id="+id+"&name="+name+"&job="+job+"&sal="+sal;
						var popup = window.open(url, 'Popup',
								'width=600,height=600');

						
					}
	
</script>
</body>
</html>