<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.bthienthidanhsachkhachhang.ListClient" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>List Client</title>
</head>

<body>
<h1>List Client</h1>
<table border="1px">
    <tr>
        <th>No</th>
        <th>Ten</th>
        <th>Ngay sinh</th>
        <th>Dia chi</th>
        <th>Anh</th>
    </tr>
    <c:forEach items="${list}" var="lists" varStatus="tt">
        <tr>
            <td>${tt.index + 1}</td>
            <td>${lists.getTen()}</td>
            <td>${lists.getNgaysinh()}</td>
            <td>${lists.getDiachi()}</td>
            <td><img height="20px" width="20px" src="${lists.getAnh()}" > </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>