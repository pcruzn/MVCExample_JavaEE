<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validación de documento</title>
</head>
<body>
<form action="DocumentController" method="post">

<table border="0">
  <tr>
    <td>Datos personales:</td>
    <td>
      <select name="personalData" id="select">
      	<option>10000000-5</option>
        <option>11111111-5</option>
        <option>12222222-4</option>
      </select>
    </td>
  </tr>
  <tr>
    <td>Datos financieros:</td>
    <td>
      <select name="financialData" id="select">
      	<option>12000</option>
        <option>13000</option>
        <option>14000</option>
      </select>
    </td>
  </tr>
  <tr>
    <td>Datos externos:</td>
    <td>
    <input type="text" name="extData" id="input" />
    </td>
  </tr>
</table>
<p>
  <input type="submit" name="btnSend" id="btnSend" value="Enviar!" />
</p>

</form>
<p>Nota: 10000000-5 tiene un error para el ejemplo.</p>
</body>
</html>