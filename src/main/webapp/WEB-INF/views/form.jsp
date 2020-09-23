<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.err{
		font-size: 9pt;
		color : red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<h1>form.jsp</h1>
	<form:form commandName="stu" action="form" method="post">
		이름 : <input type="text" name="name" value="${stu.name }">
		<form:errors cssClass="err" path="name"/><br>
		아이디 : <input type="text" name="id" value="${stu.id }">
		<form:errors cssClass="err" path="id"/><br>
		<input type="submit" value="전송">
	</form:form>
</body>
</html>