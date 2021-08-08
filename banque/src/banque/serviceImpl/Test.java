package banque.serviceImpl;

import banque.service.ICreditMetier;

public class Test {

	public static void main(String[] args) {
		ICreditMetier creditMetier = new CreditMetierImpl();
		
		System.out.println(creditMetier.CalculMensualiteCredit(200000, 4.5, 240));

	}

}
