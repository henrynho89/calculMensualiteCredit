package banque.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import banque.service.ICreditMetier;
import banque.serviceImpl.CreditMetierImpl;

class TestCreditMetier {

	ICreditMetier iCreditMetier;
	
	@BeforeEach
	public void setUp() throws Exception{
		iCreditMetier = new CreditMetierImpl();		
	}
	
	@Test
	void test() {
		double capital = 200000;
		double taux = 4.5;
		int duree = 240;
		
		double result = iCreditMetier.CalculMensualiteCredit(capital, taux, duree);
		
		double valeurReference = 1265.29;
		
		assertEquals(valeurReference, result,0.001);
	}

}
