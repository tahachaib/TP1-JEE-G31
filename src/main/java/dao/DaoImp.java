package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImp implements IDao{

    @Override
    public double getData() {
        System.out.println("From SQL DB");
        return (7);
    }
}
