package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Get requests end up here!
        
        //This will load a JSP from the servlet
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; // Stop the code call, VERY IMPORTANT! 
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Post requests end up here!
        
        //Capture incoming parameter
        String yourAge= request.getParameter("your_age");
        
        
        if(yourAge != null && !yourAge.equals("")){
            try {
                int userAge = Integer.parseInt(yourAge);
                int nextAge = userAge + 1;
                request.setAttribute("message", "Your age next birthday will be " + nextAge);
                //Load the JSP and forward the request object
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                
            }
            catch (NumberFormatException ex) {
                request.setAttribute("message", "You must enter a number");
                //Load the JSP and forward the request object
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            }
        }
        else {
            request.setAttribute("message", "You must give your current age");
            //Load the JSP and forward the request object
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        
        // stop the code call after loading a jsp
        
        return;
        
    }

}
