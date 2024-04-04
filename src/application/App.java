package application;

import polymorphisme.*;

public class App {

	public static void main(String[] args) {
			
		Fruit[] fruits;
		fruits = new Fruit[5];
		
		Pomme p = new Pomme(20);
		Orange o = new Orange(50);
		Fruit f1 = new Pomme(25);
		Fruit f2 = new Orange(21);
		
		fruits[0] = p;
		fruits[1] = o;
		fruits[2] = f1;
		fruits[3] = f2;
		
		for(int i=0;i<5;i++) {
			if(fruits[i] instanceof Orange) {
				((Orange)fruits[i]).afficherPoids();
			}
		}
		
	}

}
