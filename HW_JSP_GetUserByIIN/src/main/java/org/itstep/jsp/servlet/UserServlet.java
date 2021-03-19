package org.itstep.jsp.servlet;

import org.itstep.jsp.dao.DbManager;
import org.itstep.jsp.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("user.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String iin = request.getParameter("iin");

        User user = null;

        try {
            user = DbManager.getUserByIIN(iin);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        String redirect;

        if (user != null && user.getIin().equals(iin)) {

            redirect = "/userData";
            HttpSession session = request.getSession();
            System.out.println(user);
            session.setAttribute("USER", user);
        } else {
            redirect = "/user?error=1";
        }

        response.sendRedirect(redirect);
    }
}

