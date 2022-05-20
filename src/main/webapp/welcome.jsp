<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="answer.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
Вираз: <br>
<hr>
<form name="form" method="POST" action="/calculation">
    a: from
    <input type="number" name="aFrom">
    to
    <input type="number" name="aTo">
    step
    <input type="number" name="aStep"><br>
    b: from
    <input type="number" name="bFrom">
    to
    <input type="number" name="bTo">
    step
    <input type="number" name="bStep"><br>
    c: from
    <input type="number" name="cFrom">
    to
    <input type="number" name="cTo">
    step
    <input type="number" name="сStep"><br>
    d: from
    <input type="number" name=dFrom">
    to
    <input type="number" name="dTo">
    step
    <input type="number" name="dStep"><br>
    <input type="submit" value="Calculate">
</form>
<jsp:include page="answer.jsp" />
</body>
</html>