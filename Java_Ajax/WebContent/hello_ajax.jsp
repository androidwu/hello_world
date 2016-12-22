<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript">
/*
	function fn(){

		//创建ajax的请求对象
		var request=new XMLHttpRequest();
		
		request.onreadystatechange=function()
		{
			
		  if((request.readyState==4)&&(request.status==200))//readyState:4请求已发送完成
		    {
		       // 从服务器的response获得数据
		      var content= request.responseText;//响应回来的内容
		      
				alert(content);		      
		      
		    }
		}
		
		request.open("GET","ajaxServlet",true);//设置请求的方式以及要访问的url
		request.send(null);//发送请求
	}
	
	fn();
*/
           function getCity(){
				
				//获取省的下拉列表元素对象
				var province=document.getElementById("province");
				
				var city=document.getElementById("city");
				
				city.options.length=0;
				
				//从省下拉列表中中获取所选择了哪一个省
				var value=province.value;
				
				var request=createXMLHttpRequest();
				
				request.onreadystatechange=function()
				{
				  if((request.readyState==4)&&(request.status==200))//readyState:4请求已发送完成
				    {
				       // 从服务器的response获得数据
				      var content= request.responseText;//响应回来的内容
				      
				      //创建一个option元素
				      
				      var option=document.createElement("option");
				      
				      option.text=content;//设置下拉列表项
				      
				     	// option.value=
				      
				      city.appendChild(option);
				    }
				}
				
				request.open("GET","proServlet?pro="+value,true);//设置请求的方式以及要访问的url
				request.send(null);//发送请求
		
	
          }
          
          //创建ajax请求对象
          function createXMLHttpRequest(){
        	  
        	  return new XMLHttpRequest();
          }
</script>



</head>
<body>
	
	<select onchange="getCity();" id="province">
		<option value="sx">山西省</option>
		<option value="bj">北京市</option>
	</select>
	
	<select id="city">
	
		
	
	</select>

	
	
</body>
</html>