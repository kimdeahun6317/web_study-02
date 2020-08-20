package web_study_02.unit04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("method", "get");
		processRequest(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("method", "get");
		processRequest(request, response);
	}

	
	
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		String addr = request.getParameter("addr").trim();
		String pwd = request.getParameter("pwd").trim();
		
		request.setAttribute("id", id);
		request.setAttribute("age", age);
		request.setAttribute("addr", addr);
		request.setAttribute("pwd", pwd);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("04_result.jsp");
		dispatcher.forward(request, response);
		
	}
	
	
}
