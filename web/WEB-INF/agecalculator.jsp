<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form method="post" action="age">
            <label>Enter your age: </label>
            <input type="text" name="your_age" value="">
            <br>
            <input type="submit" value="Age Next Birthday">
            <br>
            <p>  ${message} </p>
            <a href="./arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
