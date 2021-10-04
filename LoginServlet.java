package net.codejava.servlet;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
String username;
String password;
@WebServlet("/loginServlet.html")
public class LoginServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        username = request.getParameter("username");
        password = request.getParameter("password");
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        HttpServletResponse.setContentType("/loginServlet/html")
        PrintWriter writer = response.getWriter();
         
        writer.println("<html>");
        writer.println("<body>");

        writer.println("<h2>Your username is: " + username + "<br/>");      
        writer.println("Your password is: " + password + "</h2>");    
        writer.println("</body>");
        writer.println("</html>");  

        response.sendRedirect("loginServlet/html");
        
    }
}
