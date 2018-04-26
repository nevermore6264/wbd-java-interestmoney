<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/26/2018
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <style>
        #content {
            width: 450px;
            margin: 0 auto;
            padding: 0px 20px 20px;
            background: white;
            border: 2px solid navy;
        }

        div {
            display: block;
        }
    </style>
</head>
<body>
<div id="content">
    <h1>Interest Money</h1>

    <label>Investment Amount:</label>
    <span><%=request.getAttribute("money")%></span><br>

    <label>Number Of Months:</label>
    <span><%=request.getAttribute("month")%></span><br>

    <label>Interset Rate: </label>
    <span><%=request.getAttribute("interest_rate")%></span><br>

    <label>Total Amount: </label>
    <span><%=request.getAttribute("total")%></span><br>

</div>
</body>
</html>