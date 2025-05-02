<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="convert" method="post">
    <label>From:
        <select name="from">
            <option>USD</option>
            <option>EUR</option>
            <option>GBP</option>
            <option>INR</option>
            <option>JPY</option>
        </select>
    </label><br><br>

    <label>To:
        <select name="to">
            <option>USD</option>
            <option>EUR</option>
            <option>GBP</option>
            <option>INR</option>
            <option>JPY</option>
        </select>
    </label><br><br>

    <label>Amount: <input type="number" name="amount" step="0.01" required></label><br><br>

    <input type="submit" value="Convert">
</form>
</body>
</html>
