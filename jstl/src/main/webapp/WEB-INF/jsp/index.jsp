<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Page</h1>
	<p class="msg">${empty msg ? "please wait..." : msg}</p>
	<form method="post" action="/jstl/">
		<div>
			<input type="checkbox" id="check1" name="check1" />
			<label for="check1">체크</label>
		</div>
		<div>
			<input type="radio" id="radioA" name="radio1" value="male"/>
			<label for="radioA">남성</label>
		</div>
		<div>
			<input type="radio" id="radioB" name="radio1" value="female"/>
			<label for="radioB">여성</label>
		</div>
		<div>
			<select id="select1" name="select1" size="4">
				<option value="Windows">Windows</option>
				<option value="Mac">Mac</option>
				<option value="Linux">Linux</option>
			</select>
			<select id="select2" name="select2" size="4" multiple="multiple">
				<option value="Android">Android</option>
				<option value="iPhone">iPhone</option>
				<option value="Winfone">Windows Phone</option>
			</select>
		</div>
		<input type="submit" value="Click"/>
	</form>
</body>
</html>