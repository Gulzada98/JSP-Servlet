<%@ page import="org.itstep.jsp.entity.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
    <%@include file="templates/head.jsp" %>
</head>
<body>
<%@include file="templates/navbar.jsp" %>

<div class="container mt-4">
    <div class="card col-sm-3">
        <img src="templates/1.png" class="card-img-top" alt="..." style="width: auto">
        <div class="card-body">
            <h5 class="card-title">USER INFO</h5>

        </div>
        <%
            User user = (User) request.getSession().getAttribute("USER");

        %>

        <ul class="list-group list-group-flush">
            <li class="list-group-item"><%=user.getName()%></li>
            <li class="list-group-item"><%=user.getSurname()%></li>
            <li class="list-group-item"><%=user.getCountry()%></li>
            <li class="list-group-item"><%=user.getCity()%></li>
            <li class="list-group-item"><%=user.getIin()%></li>

        </ul>

    </div>

</div>

</body>
</html>
