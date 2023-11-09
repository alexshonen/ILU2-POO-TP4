package produit;

public class Poisson extends Produit {
	private String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson", Unite.piece);
		this.datePeche = datePeche;
	}
	public String getDatePeche() {
		return datePeche;
	}
	
	@Override
	public String description() {
		return "poisson péché " + datePeche;
	}
}
