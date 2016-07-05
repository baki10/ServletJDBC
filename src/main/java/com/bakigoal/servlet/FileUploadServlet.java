package com.bakigoal.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * Created by ilmir on 05.07.16.
 */
@WebServlet(urlPatterns = {"/FileUploadServlet"})
@MultipartConfig(location = "/tmp")
public class FileUploadServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
      throws ServletException, IOException {
    for (Part part : request.getParts()) {
      String submittedFileName = part.getSubmittedFileName();
      part.write(submittedFileName);
    }
    response.sendRedirect("home.jsp");
  }
}
