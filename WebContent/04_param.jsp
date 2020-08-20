<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript" src="param.js"></script>

</head>
<body>
	<h3>get 방식에서 한글 깨짐 방지</h3>
	<form method="get" action="ParamServlet" name="frm">
		
		<label for="userid">아이디 : </label>
		<input type="text" name="id" id="userid"><br>
		<label for="userage"> 나 &nbsp; 이 : </label>
		<input type="text" name="age" id="age"><br>
		<label for="useraddr">주소 : </label>
		<input type="text" name="addr" id="useraddr"><br>
		<label for="userpwd">암호</label>
		<input type="password" name="pwd" id="userpwd"><br>
		 <input type="submit" value="로그인" onclick= "return check()" class="submit_btn"> 
	</form>
	<br>
	<h3>post 방식에서 한글 깨짐 방지</h3>
	<form method="post" action="ParamServlet" name="frm">
	
		아이디 : <input type="text" name="id"><br>
		 나 &nbsp; 이 : <input type="text" name="age"><br>
		 주소 : <input type="text" name="addr"><br>
		  <input type="submit" value="전송" onclick= "return check()" > 
	</form>
	
</body>
</html>