<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<spring:url value="/resources/css/main.css" var="mainCss"></spring:url>
<link href="${mainCss}" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.4.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/main.js" />"></script>
</head>
<div id="loginIdDiv">
<table>
<form:form action="" commandName="users">
<input type="hidden" value="${activTab}" id="loginHiddenId"/>
<th>
<h3>Welcome To Login</h3>
</th>
<tr>
 <td>Please Enter User Name: <form:input path="userName" id="userNameId"/></td>
 </tr>
 <tr>
 <td>Please Enter Password: <form:input path="passWord" id="passWordId"/></td>
</tr>
<tr>
 <td><input type="submit" value="Login" id="loginId"/></td>
</tr>
<tr>
 <td><a href="/BloodDonateApplicationSpring/login/renderRegister" id="newUserId">New User</a></td>
 </tr>
</form:form>
</table>
</div>

<div id="registerIdDiv">
<table>
<form:form action="" commandName="users">
<th>
<h3>Welcome To User Registration</h3>
</th>
<tr>
 <td>Please Enter User Name: <form:input path="userName" id="userNameId"/></td>
 </tr>
 <tr>
 <td>Please Enter Password: <form:input path="passWord" id="passWordId"/></td>
</tr>
<tr>
 <td>Contact Number: <form:input path="userName" id="userNameId"/></td>
 </tr>
 <tr>
 <td>Alternate Contact Number: <form:input path="passWord" id="passWordId"/></td>
</tr>
<tr>
 <td>Permanent Address: <form:input path="userName" id="userNameId"/></td>
 </tr>
 <tr>
 <td>Temparory Address: <form:input path="passWord" id="passWordId"/></td>
</tr>
<tr>
 <td><input type="submit" value="Register" id="registerId"/></td>
</tr>
</form:form>
</table>
</div>
