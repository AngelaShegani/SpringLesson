<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
</head>
<body>
    <h1>Hello World</h1>
    <% for(int i = 0; i < 5; i++) { %>
        <p><%= i %></p>
    <% } %>
    <h1>End of loop</h1>

    <h1><c:out value="${2*100}"></c:out></h1>
    <h1><c:out value="${fruit}"></c:out></h1>

    <ul>
        <c:forEach var="loc" items="${ allLocations}">
            <li>${ loc }</li>
        </c:forEach>
    </ul>
</body>
</html>
