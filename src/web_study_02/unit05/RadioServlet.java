package web_study_02.unit05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender").trim();
		String mail = request.getParameter("chk_mail").trim();
		String text = request.getParameter("content").trim();
		
		request.setAttribute("gender", gender);
		request.setAttribute("mail", mail);
		request.setAttribute("text", text);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("04_radio.jsp");
		dispatcher.forward(request, response);
	}

}
