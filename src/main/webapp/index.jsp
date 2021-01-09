<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>

<h2>
	<a href="account/findAll">测试查询</a> <br/>
</h2>
<hr/>

<h2>
	<a href="account/findAll">测试保存</a> <br/>
</h2>
<form action="account/saveAccount" method="post">
	姓名：<input type="text" name="name"> <br/>
	金额：<input type="text" name="name"> <br/>
	<input type="submit" value="保存账户">
</form>

</body>
</html>