<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="student" method="POST"> -->
<!-- 		student id : <input type="text" name="id" /></br> -->
<!-- 		<input type="submit" value="����" /> -->
<!-- 	</form> -->
	
		<%
			String context = request.getContextPath();
			System.out.println(">>" + context);
		%>
		<form action="<%=context%>/studentView" method="post">
			�̸� : <input type="text" name="name"><br>
			���� : <input type="age" name="age"><br>
			�г� : <input type="classNum" name="classNum"><br>
			   �� : <input type="gradeNum" name="gradeNum"><br>
			<input type="submit" name="����"><br>
		</form>
</body>
</html>