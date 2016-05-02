package Modele.Perso;

public class Hero extends Personnage {

	public Hero(String nom, int vie, int force, int esprit, int vitesse, int resistance, int chance, int initiative,
			int attaque, int defense) {
		super(nom, vie, force, esprit, vitesse, resistance, chance, initiative, attaque, defense);
		// TODO Auto-generated constructor stub
	}

	public void fuir(){

	}

	@Override
	public void comportementCombat(Personnage personnage) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*3);
		switch(i){
		case 1:
			System.out.println("hero :"+attaquerCritique(personnage));
			break;
		default:
			System.out.println("hero :"+attaquer(personnage));
			break;
		}
	}
}
