<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de errores en la validación</title>
</head>
<body>
<p>Errores</p>
<table>
      <tr>
      	<th>Documento</th>
      	<th>Error</th>
      </tr>
      <c:forEach items="${errors}" var="current">
        <tr>
          <td><c:out value="${current.docId}" /><td> 
          <td><c:out value="${current.validationError}" /><td>
        </tr>
      </c:forEach>
</table>
</body>
</html>