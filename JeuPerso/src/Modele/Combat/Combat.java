package Modele.Combat;

import Modele.Perso.Hero;
import Modele.Perso.Monstre;

public class Combat {
	private Hero hero;
	private Monstre monstre;

	public Combat(Hero hero,Monstre monstre){
		while(hero.isVivant()&&monstre.isVivant()){
			hero.Attaquer(monstre);
			monstre.Attaquer(hero);
		}
		if(hero.isVivant())
			System.out.println("hero gagne");
		else
			System.out.println("monstre gagne");
	}
}
