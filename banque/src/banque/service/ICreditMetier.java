package banque.service;

public interface ICreditMetier {

	public double CalculMensualiteCredit(double capital, double taux, int duree);
}
