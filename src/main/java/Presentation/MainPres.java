package Presentation;

import Dao.DaoImpl;
import Dao.DaoImplV2;
import Dao.IDao;
import Metier.IMetier;
import Metier.MetierImpl;

public class MainPres {
    public static void main(String[] args) {
        IDao dao = new DaoImplV2();
        IMetier metier = new MetierImpl(dao);

        System.out.println(metier.calcul());

    }
}
