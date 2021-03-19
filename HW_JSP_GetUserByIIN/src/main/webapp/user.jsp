<%--
  Created by IntelliJ IDEA.
  User: Sten
  Date: 3/19/2021
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
    <%@include file="templates/head.jsp" %>
</head>
<body>
<%@include file="templates/navbar.jsp" %>

<div class="container mt-5">
    <div class="row">
        <div class="col-sm-4 offset-4">

            <%
                Object error = request.getParameter("error");
                if (error != null && error.equals("1")) {
            %>
            <div class="alert alert-warning">
                <strong>Incorrect IIN!</strong>
            </div>
            <%
                }
            %>
            <form action="user" method="post">
                <div class="form-group">
                    <label>IIN: </label>
                    <input class="form-control" type="number" name="iin" required
                           value="<%=request.getParameter("iin") != null ? request.getParameter("iin"):""%>">
                </div>

                <div class="form-group mt-2">
                    <button class="btn btn-success">SEARCH</button>
                </div>
            </form>

        </div>
    </div>

</div>

</body>
</html>
