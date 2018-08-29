<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAuth Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />

</head>
<body>
<h1>Authorize me to git your github info!</h1>

<a href="https://github.com/login/oauth/authorize?client_id=${id}&redirect_uri=http://localhost:8080/result&scope=user&state=hakhhfuahuhwauhfahjahfa"><button class="btn btn-primary">Sure, I trust you...</button></a>


</body>
</html>