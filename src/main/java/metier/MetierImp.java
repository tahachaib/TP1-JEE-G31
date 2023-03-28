package metier;

import dao.IDao;

public class MetierImp implements IMetier{
    IDao dao;

    @Override
    public double calcul() {
        double data = dao.getData();
        return data*10;
    }
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
