package presentation;

import dao.DaoImp;
import dao.DaoNSQL;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args){
        MetierImp metier = new MetierImp();
        DaoImp sql = new DaoImp();
        DaoNSQL nosql = new DaoNSQL();


        metier.setDao(nosql);
        double resultat = metier.calcul();
        System.out.println("Resultat est : "+resultat);
    }
}
