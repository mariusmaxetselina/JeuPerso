package Modele.Perso;

public class FabriqueMonstre {
/**classe Fabrique suivant le principe de la fabrique abstraite.
 * 
 * @return
 */
	public static Monstre creerMonstreTest1()
	//Constructeur
	{
		return new Monstre("goblin", 100, 2, 1, 1, 1, 1, 1, 1, 1);
	}
}
