package ext;

import dao.IDao;

public class DaoImplV1 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp= 23;
        return temp;
    }
}