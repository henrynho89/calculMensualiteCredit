package banque.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.service.ICreditMetier;
import banque.serviceImpl.CreditMetierImpl;

@WebServlet(name = "cs", urlPatterns = {"*.do","*.php","*.asp"})
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ICreditMetier creditMetier;
	CreditModel creditModel;
	
    
    @Override
    public void init() throws ServletException {
    	creditMetier = new CreditMetierImpl();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();
		if("".equals(path)) {
			request.getRequestDispatcher("vueCredit.jsp").forward(request, response);
		}
		else if("calculer.do".equals(path)) {
			double montant = Double.parseDouble(request.getParameter("montant"));
			double taux = Double.parseDouble(request.getParameter("montant"));
			int duree = Integer.parseInt(request.getParameter("duree"));
			double mensualite = creditMetier.CalculMensualiteCredit(montant, taux, duree);
			
			creditModel = new CreditModel();
			creditModel.setMontant(montant);
			creditModel.setDuree(duree);
			creditModel.setTaux(taux);
			creditModel.setMensualite(mensualite);
			
			request.setAttribute("creditModel", creditModel);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
