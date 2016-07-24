<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  
    This is my JSP page. <br>
    spring3+hibernate4+struts2<br/>
    <s:form action="Cat_SaveCat.action" method="post">
    	<s:textfield name="name"></s:textfield>
    	<s:submit value="save"></s:submit>
    </s:form>
    <s:a href="Cat_listCat.action">查看</s:a><br/>
    
    <s:a href="Cat_SaveCat.action?name=hello">add</s:a>
    <br/>
    <form action="Cat_SaveCat.action" method='post'>
    	<input type="text" name="name"/>
    	<input type="submit"/>
    </form>
    
  </body>
</html>
