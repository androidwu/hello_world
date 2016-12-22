<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript">
         
		function validateCode(){
        	   
				//获取省的图片对象
				var imgE=document.getElementById("img");
				
				//设置图片的url
				imgE.src="validateCodeServlet?"+new Date();
				
          }
          
</script>



</head>
<body>
	
	<form action="#" method="post">
	
		<input type="text" name="validateCode"/>
		<img src="validateCodeServlet" onclick="validateCode();" id="img"/>
	
	</form>
	
	
</body>
</html>