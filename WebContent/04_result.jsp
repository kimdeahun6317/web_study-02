<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param 결과 and radio</title>
</head>
<body>

	<h1>${id}님은${age}살입니다</h1>
	<h2>주소는 ${addr}입니다</h2>
	<h2>비밀번호는 ${pwd}입니다</h2>
	<br>

	<form action="RadioServlet" method="get" name="frm">
	<label for="gender"> 성별 : </label>
	<input type="radio" id="gender" name="gender" value="남자" checked>남자
	<input type="radio" id="gender" name="gender" value="여자">여자 <br><br>
	<label for="chk_mail">메일 정보 수신 여부 : </label>
	<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked>수신
	<input type="radio" id="chk_mail" name="chk_mail" value="no">거부 <br><br>
	<label for="content">간단한 가입 인사 적어주세요 ^o^</label>
	<textarea rows="3" cols="35" id="content" name="content"></textarea><br>
	<a href='javascript:history.go(-1)'>다시</a>
	<input type="submit" value="다음">
	</form>
</body>
</html>