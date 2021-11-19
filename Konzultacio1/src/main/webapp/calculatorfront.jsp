<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="Calculator" method="post">
    A:<input type="text" name="numa"><br>  
    B:<input type="text" name="numb"><br> 
    Operation:<select name="op">
    	<option value="add">addition</option>
    	<option value="sub">subtraction</option>
    	<option value="mul">multiplication</option>
    	<option value="div">division</option>
    </select>
    <input type="submit" value="do math">  
    </form>  
</body>
</html>