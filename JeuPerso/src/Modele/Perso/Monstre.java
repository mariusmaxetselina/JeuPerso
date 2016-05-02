package Modele.Perso;

public class Monstre extends Personnage {

	public Monstre(String nom, int vie, int force, int esprit, int vitesse, int resistance, int chance, int initiative,
			int attaque, int defense) {
		super(nom, vie, force, esprit, vitesse, resistance, chance, initiative, attaque, defense);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportementCombat(Personnage perso) {
		// TODO Auto-generated method stub
		int rand = (int)(Math.random()*3);
		switch(rand){
		case 1:
			System.out.println("monstre :"+attaquerCritique(perso));
			break;
		default:
			System.out.println("monstre :"+attaquer(perso));
			break;
		}
	}

}
