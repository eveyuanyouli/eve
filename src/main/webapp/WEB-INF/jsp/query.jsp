<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/1/26
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>query</title>
    <%@include file="common/head.jsp" %>
</head>

<body>
<h3 align="center"> ${name} </h3>

<c:forEach var="eve" items="${list}">
    <tr>
        <td>${eve.name}</td>
        <td>${eve.des}</td>
    </tr>
    <a onclick="forword('${name}')">Click</a>
</c:forEach>

<script type="text/javascript">
    function forword(e) {
        $.ajax({
            url: "get.action",
            type: "GET",
            data: {
                name: e
            },
            dataType: "json",
            success: function (res) {
                if (res === 1) {
                    alert("Success !" + res);
                    self.location = "./list";
                }

                if (res === 0) {
                    alert("Error !" + res)
                }
            }
        })
    }
</script>
</body>

<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
