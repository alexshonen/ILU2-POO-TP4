package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.kilogramme);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public Gaulois getChasseur() {
		return chasseur;
	}
	
	@Override
	public String description() {
		return "sanglier de " + poids + " kilos chassé par " + chasseur.getNom();
	}
}
