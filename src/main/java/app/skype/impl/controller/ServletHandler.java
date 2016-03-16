package app.skype.impl.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by TheOne on 03.02.16.
 */
@WebServlet(loadOnStartup = 1,name="SkypeWebApp", urlPatterns = "/app/*")
public class ServletHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        process(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }
    protected void process(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("APP SERVLET");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
