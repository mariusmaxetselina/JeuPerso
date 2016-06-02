package Modele.Perso;

public class FabriqueMonstre {
/**classe Fabrique suivant le principe de la fabrique abstraite.
 * 
 * @return
 */
	public static Monstre creerTechnicien()
	//Constructeur
	{
		return new Monstre("technicien", 100, 2, 1, 1, 1, 1, 1, 1, 1);
	}
}
