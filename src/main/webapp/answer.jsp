<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zahar
  Date: 22.04.2022
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<html>
<head>
    <title>Answer</title>
</head>
<body>
    <table>
        <tr>
            <th>a</th>
            <th>b</th>
            <th>c</th>
            <th>d</th>
            <th>result</th>
        </tr>
        <tr>
            <c:forEach var="answer" items="${answers}">
                <td>${answer.a}</td>
                <td>${answer.b}</td>
                <td>${answer.c}</td>
                <td>${answer.d}</td>
                <td>${answer.result}</td>
            </c:forEach>
        </tr>
    </table>
Hello
</body>
</html>
