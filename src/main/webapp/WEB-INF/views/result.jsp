<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<h1>You let me authorize your info! Thanks!</h1>

<h1>${test }</h1>

	<script type="text/javascript">
	
	// we no longer need any of this, taking the data to the java side!
		var url = window.location.href;
		console.log(url);
		var params = url.split("?");
		console.log(params[1]);
		var paramsArray = params[1].split("&");
		console.log(paramsArray);
		var code = paramsArray[0].split("=")[1];
		console.log(code);
		
		
		// use the code to get access token
/* 		getAccessToken(code);
		
		// Allow us to get access to the access_token using the parsed code from above
		function getAccessToken(code) {
			var xhttp = new XMLHttpRequest();
			
			xhttp.onreadystatechange = function() {
				if (this.readystate == 4 && this.status == 200) {
					var jsonObject = JSON.parse(this.responseText);
				} else {
					console.log('There was a problem with the request.' + this.status);
				}
			};
			
			xhttp.open("POST", "https://github.com/login/oauth/access_token", true);
			// indicates that we are sending form data
			xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			xhttp.setRequestHeader("Accept", "application/json");
			xhttp.setRequestHeader("Access-Control-Allow-Origin", "true");
			xhttp.send("client_id=7aac27aab7098fb7693a&client_secret=da44222d8db252f61df3760bedd060255ed825f2&redirect_uri=http://localhost:8080/result&state=hakhhfuahuhwauhfahjahfa&code=" + code);
			
		} */
		
		
		
		
	</script>
</body>
</html>