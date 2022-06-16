package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get requests end up here!
        
        //This will load a JSP from the servlet
        request.setAttribute("finalResult", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;  //Stop the code call, VERY IMPORTANT!
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstVal = request.getParameter("firstValue");
        String secondVal = request.getParameter("secondValue");
        String result = ""; 
        
        if(firstVal == null || secondVal == null || firstVal.equals("") || secondVal.equals(""))  {
         result = "invalid";   
        }
        else {
            try {
                double firstDoubleVal = Double.parseDouble(firstVal);
                double secondDoubleVal = Double.parseDouble(secondVal);
                
                double calcResult = 0;
                
                switch(request.getParameter("calculate").charAt(0))  {
                    case '+': calcResult = firstDoubleVal + secondDoubleVal; break;
                    case '-': calcResult = firstDoubleVal - secondDoubleVal; break;
                    case '*': calcResult = firstDoubleVal * secondDoubleVal; break;
                    case '%': calcResult = firstDoubleVal % secondDoubleVal; break;
            }
                result =  "" + calcResult;
                
        }
            catch(NumberFormatException ex) {
                result = "ïnvalid";
            }
        }
        
        request.setAttribute("finalResult", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        return;   

        
        
    }
    
}
    

   

        