package Modele;

import Modele.Combat.Combat;
import Modele.Perso.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Bob Morane", 100, 2, 2, 1, 1, 1, 1, 1, 1);
		Monstre monstre = FabriqueMonstre.creerTechnicien();
		Combat combat = new Combat(hero,monstre);
	}

}
