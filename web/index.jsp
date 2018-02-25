<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <center><p><h1>Rubrica</h1></p></center>
    <html:form action="/creaNominativo" method="post">
        Nome: <html:text property="nome" /><br/>
        Cognome: <html:text property="cognome" /><br/>
        Numero: <html:text property="numero"/><br/>
        <html:submit title="Invia"/>
    </html:form>
    </body>
</html>