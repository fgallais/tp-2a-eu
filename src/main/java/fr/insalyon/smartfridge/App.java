package fr.insalyon.smartfridge;


import fr.insalyon.smartfridge.modeles.Type;
import fr.insalyon.smartfridge.modeles.dao.BaseDAO;
import fr.insalyon.smartfridge.modeles.dao.TypeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BaseDAO.initialiserPersistence();

        Type unType = new Type("WOW ! Je Persiste !");
        BaseDAO.creerTransaction();
        TypeDAO.persiste(unType);
        BaseDAO.enregistrerTransaction();

        Type leMemeType = TypeDAO.trouveId(unType.getId());

        System.out.println(leMemeType.getNom());

        BaseDAO.detruirePersistence();
    }
}
