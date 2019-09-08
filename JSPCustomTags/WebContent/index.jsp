<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/pic.tld" prefix="tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tagged Images</title>

<!--  NOTE style sheet is empty to demonstrate tag parameters -->
<style><%@include file="/css/styles.css" %></style>
</head>

<body>
<table class="container" style="border: solid gray 2px">
	<td>
		<tags:pic reference="img/dummypic4.jpg" height="100" width="100" />
	</td>
		
	<td>
		<tags:pic reference="img/dummypic4.jpg" height="100" width="100" border="1" />
	</td>
	
	<td>
		<tags:pic reference="img/dummypic3.jpeg" height="100" width="100" label="Dummy!"/>
	</td>
	
	<td>
		<tags:pic reference="img/dummypic3.jpeg" height="100" width="100" border="1" label="Dummy!" />
	</td>
</table>
</body>
</html>