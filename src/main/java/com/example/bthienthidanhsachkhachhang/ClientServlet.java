package com.example.bthienthidanhsachkhachhang;
import org.jetbrains.annotations.NotNull;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "clientServlet", value = "/client")
public class ClientServlet extends HttpServlet {

    public void doGet(@NotNull HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<ListClient> listC = new ArrayList<>();

        listC.add(new ListClient("Vinh","27/11/2000","Ha Noi","https://i.imgur.com/0tHWGTD.jpg"));
        listC.add(new ListClient("Tuan","17/01/1996","Ha Noi","https://storage.googleapis.com/support-forums-api/avatar/profile-1883370-14349354778559679234.jpg"));
        listC.add(new ListClient("Hieu","07/05/1995","Bac Ninh","https://i.pinimg.com/736x/ec/cd/0f/eccd0f619df78b9fcbfff58abc023b02.jpg"));
        request.setAttribute("list",listC);
        RequestDispatcher rD = getServletContext().getRequestDispatcher("/index.jsp");
        rD.forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {}
    public void destroy() {
    }
}