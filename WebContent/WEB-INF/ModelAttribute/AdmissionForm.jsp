<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${heading}</h1></br>
	<h2>Admission Form</h2>
	<form:errors path="student.*"/>
	<form action="admission-form" method="post">
		<p>
			Name: <input name="name" type="text" value=""/>
		</p>
		<p>
			Hobby: <input name="hobby" type="text" value=""/>
		<p>
		<p>
			Mobile: <input name="mobile" type="text" value=""/>
		</p>
		<p>
			DOB: <input name="date_of_birth" type="text" value=""/>
		<p>
		<p>
			Skill Set: <select name="skill" multiple>
				<option>JAVA</option>
				<option>PHP</option>
				<option>.NET</option>
				<option>Python</option>
			</select>
			
			<table>
				<th>Address: </th>
				<td>
					<input type="text" name="address.street"/>
					<input type="text" name="address.building"/>
				</td>
			</table>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>