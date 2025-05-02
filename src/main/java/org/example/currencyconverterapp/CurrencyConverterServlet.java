package org.example.currencyconverterapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/convert")
public class CurrencyConverterServlet extends HttpServlet {

    private static final Map<String, Double> rates = new HashMap<>();

    @Override
    public void init() throws ServletException {
        rates.put("USD", 1.0);
        rates.put("EUR", 0.85);
        rates.put("GBP", 0.75);
        rates.put("INR", 82.0);
        rates.put("JPY", 110.0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String from = req.getParameter("from");
        String to = req.getParameter("to");
        double amount = Double.parseDouble(req.getParameter("amount"));

        double fromRate = rates.getOrDefault(from, 1.0);
        double toRate = rates.getOrDefault(to, 1.0);
        double result = (amount / fromRate) * toRate;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>" + amount + " " + from + " = " + result + " " + to + "</h2>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
    }
}
