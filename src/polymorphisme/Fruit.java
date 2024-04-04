package polymorphisme;

public abstract class Fruit {
	
	protected int poids;
	
	public Fruit() {
		System.out.println("Creation d'un fruit");
	}
	
	public void afficher() {
		System.out.println("C'est un fruit");
	}
;
	public void change() {
		System.out.println("Change Fruit");
	}
}
