package web_study_02.unit09;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item[] = request.getParameterValues("item");
		
		
		if(item.length==-1) {
			System.out.println("선택하신 항목이 없습니다");
			return;
		}
		String items = "";
		for(int i=0; i<item.length; i++) {
			if(i==0) {
				items+=item[i];
			}else{
				items+="+"+item[i];
			}
			
			
		}
		request.setAttribute("item", items);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("09_checkbox.jsp");
		dispatcher.forward(request, response);
	}

}
