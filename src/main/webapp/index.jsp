<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<body>
<h2>Hello World!</h2>
<ul>
  <li>随机数：<%= java.lang.Math.random()*100000 %></li>
  <li>sessionid：<%= request.getSession().getId() %></li>
</ul>

<h4>auto build</h4>
  20170619.1824
</body>
</html>
