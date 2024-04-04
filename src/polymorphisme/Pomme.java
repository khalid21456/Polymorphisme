package polymorphisme;

public class Pomme extends Fruit{
	
	public Pomme(int p) {
		poids = p;
		System.out.println("Création d'un pomme de "+poids+" grammes");
	}
	
	
	public void afficher() {
		System.out.println("C'est un pomme");
	}
	
	public void afficherPoids() {
		System.out.println("Le poids de la pomme est "+poids);
	}
}
