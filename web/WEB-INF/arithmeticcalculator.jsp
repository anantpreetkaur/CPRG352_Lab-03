<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="firstValue" value="">
            <br>
            <label>Second: </label>
            <input type="text" name="secondValue" value="">
            <br>
            <input type="submit" name="calculate" value="+">
            <input type="submit" name="calculate" value="-">
            <input type="submit" name="calculate" value="*">
            <input type="submit" name="calculate" value="%">
            <br>
            <p>Result: ${finalResult}</p>
            <a href="./age">Age Calculator</a>
        </form>
    </body>
</html>
