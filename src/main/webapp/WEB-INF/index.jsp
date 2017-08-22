<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/8/22
  Time: 上午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
<div class="container">
    <div class="input-group">
        <input id="content" type="text" class="form-control" placeholder="请输入留言...">
        <span class="input-group-btn">
        <button id="btn" class="btn btn-default" type="button">点击留言</button>
      </span>
    </div>

    <table class="table table-bordered" id="tab">

    </table>
</div>
</body>
</html>
