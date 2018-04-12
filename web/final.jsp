<%-- 
    Document   : final
    Created on : 12-abr-2018, 20:36:11
    Author     : Kelvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Incidencias</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        <%
            String status = (String) request.getAttribute("status");
            if(status != null){
             %>
             
             <h1><%= status %></h1>
            
             <%
            }
            %>
    </body>
</html>
