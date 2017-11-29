<%-- 
    Document   : lista
    Created on : Nov 27, 2017, 12:22:57 PM
    Author     : daniel.riveraa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Bandas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="shortcut icon" type="image/x-icon" href="/img/favicon(3).ico" />
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>D&D Music - la mejor calidad a tu servicio</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts for this template -->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Cabin:700' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="css/grayscale.css" rel="stylesheet">
    </head>
    <body>
        <section id="login" class="list-section content-section text-uppercase">
    </table>
</form>
<br>

<table class="table table-striped ">
    <center>
        <h2 class="section-heading text-uppercase">Lista</h2>
        
    <tr>
        
        <th scope="col"><center>Agrupación</center></th>
        <th scope="col"><center>Representante</center></th>
        <th scope="col" ><center>Link youtube</center></th>
        <th scope="col"><center>Nominaciones</center></th>
        <th scope="col"><center>Eliminar</center></th>
        
    </tr>
            

    <c:forEach items="${bandas}" var="banda">
        
        <tr>
            <td><center>${banda.nombreArtistico}</center></td>
            <td><center>${banda.representante}</center></td>
            <td ><center><a href="
                            ${banda.linkMejorCancion}" >${banda.linkMejorCancion}</a></center></td>
            <td><center>${banda.nominaciones}</center></td>
            <td><center><a href="EliminarBanda?id=${banda.id}">Eliminar</a></center></td>
        </tr>
        
    </c:forEach>
    </center>
</table>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</section>
</body>
</html>
