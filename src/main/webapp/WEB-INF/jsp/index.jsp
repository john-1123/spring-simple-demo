<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Spring Boot!</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
    <h2>Task List</h2>
    <table>
        <thead>
            <tr>
                <th>TaskSeq</th>
                <th>TaskName</th>
                <th>Description</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${taskList}" var="task">
                <tr>
                    <td>${task.taskSeq}</td>
                    <td>${task.taskName}</td>
                    <td>${task.description}</td>
                    <td>
                        <a href="remove/${task.taskSeq}">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h2>Add New Task</h2>
    <form:form action="add" method="POST">
        Task Name: <input type="text" name="taskName"/><br><br>
        Description: <input type="text" name="description"/><br><br>
        <input type="submit" value="save"/>
    </form:form>
</body>
</html>