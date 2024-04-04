package polymorphisme;

public class Orange extends Fruit{
	
	public Orange(int p) {
		super();
		poids = p;
		System.out.println("Création d'une orange de "+poids+" grammes");
	}
	
	public void afficher() {
		System.out.println("C'est une orange");
	}
	
	public void afficherPoids() {
		System.out.println("Le poids de l'orange est "+poids);
	}
}
