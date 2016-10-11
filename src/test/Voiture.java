package test;

public class Voiture {

	public String immatriculation;
	public String couleur="blanche";
	public String moteur;
	
	public void roule(int vitesse){
		System.out.println("je roule à " + vitesse + " km/h");
	}
	
	public void freine(){
		System.out.println("je n'avance plus.");
	}
	
	public void afficherDescription(){
		System.out.println("L'immatriculation est : " + this.immatriculation);
		System.out.println("La couleur est : " + this.couleur);
		System.out.println("Elle dispose d'un moteur " + this.moteur);
	}
}
