<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP</title>
</head>
<body>
    <jsp:useBean id="myBean" class="beans.MyBean" />
    <jsp:setProperty property="language" value="${param.lang}" name="myBean" />
    <h1><%= myBean.getMessage() %>!</h1>
</body>
</html>