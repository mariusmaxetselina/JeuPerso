package Modele.Perso;

public abstract class Personnage {
	//variables de classes
	private String nom;
	protected int vie;
	protected int force,esprit,vitesse,resistance,chance,initiative;
	protected int attaque,defense;
	
	public Personnage(String nom, int vie, int force, int esprit, int vitesse, int resistance, int chance,
			int initiative, int attaque, int defense) 
	//Constructeur
	{
		super();
		this.nom = nom;
		this.vie = vie;
		this.force = force;
		this.esprit = esprit;
		this.vitesse = vitesse;
		this.resistance = resistance;
		this.chance = chance;
		this.initiative = initiative;
		this.attaque = attaque;
		this.defense = defense;
	}

	public int Attaquer(Personnage perso){
		/**
		 * fonction:
		 * permet d'attaquer un autre perso
		 * parametre:
		 * personnage adverse
		 * return:
		 * les points de dégats qu'à pris l'adversaire
		 */
		//risque de subir des changements
		if(force*vitesse>perso.resistance){
			perso.vie=perso.vie-(force*vitesse-perso.resistance);
			return force*vitesse-perso.resistance;
		}else{
			return 0;
		}
	}
	
	public boolean isVivant(){
		return vie>0;
	}

}