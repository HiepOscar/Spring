<%-- 
    Document   : nameView
    Created on : Oct 22, 2020, 9:07:41 AM
    Author     : Nammain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="x" uri="http://www.springframework.org/tags" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <x:nestedPath path="name">
            <form action="" method="POST">
                Name:
                <x:bind path="value">
                    <input type="text" name="${status.expresion}" value="${status.value}">
                </x:bind>
                    <input type="submit" value="OK">
            </form>
        </x:nestedPath>
    </body>
</html>
