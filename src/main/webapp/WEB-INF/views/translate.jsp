<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/24/2018
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translation</title>
</head>
<body>
<h1>The meaning of <c:out value="${requestScope['word']}"/> is <c:out value="${requestScope['translated']}"/></h1>
</body>
</html>
