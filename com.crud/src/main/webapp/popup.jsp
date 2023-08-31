<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<label for="id">Employee Id </label><input type="number" id="id" name="id" value=""><br><br><br>
	<label for="name">Employee Name </label><input type="text" id="name" name="name" value=""><br><br><br>
	<label for="job">Job </label><input type="text" id="job" name="job" value=""><br><br><br>
	<label for="sal">Salary</label><input type="text" id="sal" name="sal" value=""><br><br><br><br><br>
	
	<button id="save" class="btn btn-primary" name="click" value="">Save</button>
	
	
	
	
</form>
</center>
<script type="text/javascript">
var queryParams = new URLSearchParams(window.location.search);
var click = queryParams.get('click');
document.getElementById("save").value=click;
const id=queryParams.get('id');
document.getElementById('id').value=id;
const name=queryParams.get('name');
document.getElementById('name').value=name;
const job=queryParams.get('job');
document.getElementById('job').value=job;
const sal=queryParams.get('sal');
document.getElementById('sal').value=sal;




</script>
</body>
</html>