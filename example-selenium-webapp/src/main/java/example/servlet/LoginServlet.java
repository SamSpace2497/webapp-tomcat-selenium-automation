package example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCheck")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String uname = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		
		if(uname.equals("shubham") && pwd.equals("2497"))
			resp.getWriter().write("<h1>Welcome back</h1>");
		else
			resp.getWriter().write("<h1>Invalid Username/Password</h1>");
				
	}
	
}