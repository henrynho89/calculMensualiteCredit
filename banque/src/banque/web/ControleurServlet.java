package banque.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.service.ICreditMetier;
import banque.serviceImpl.CreditMetierImpl;

public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ICreditMetier creditMetier;
    
    @Override
    public void init() throws ServletException {
    	creditMetier = new CreditMetierImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
