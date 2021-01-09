<%--
  Created by IntelliJ IDEA.
  User: 卢永
  Date: 2021/1/6
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>

<h2>查询所有的账户信息</h2>

<c:forEach items="${accountList}" var="account">
	${account.name} ${account.money}
</c:forEach>

</body>
</html>
