<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>radio 결과and 체크박스</title>
</head>
<body>
	<h1>성별은 ${gender}입니다</h1>
	<h2>이메일 수신여부는 ${mail}입니다</h2>
	<h3>가입인사말 : ${text}</h3>


	<h2>악세사리</h2>
	관심항목을 선택하세요.
	<hr>

	<form action="CheckboxServlet" method="get">
		<input type="checkbox" name="item" value="신발">신발 <input
			type="checkbox" name="item" value="가방">가방 <input
			type="checkbox" name="item" value="벨트">벨트 <input
			type="checkbox" name="item" value="모자">모자 <input
			type="checkbox" name="item" value="시계">시계 <input
			type="checkbox" name="item" value="쥬얼리">쥬얼리<br> <a
			href='javascript:history.go(-1)'>다시</a> <input type="submit"
			value="다음">
	</form>


</body>
</html>