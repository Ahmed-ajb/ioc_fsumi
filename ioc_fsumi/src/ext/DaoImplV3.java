package ext;

import dao.IDao;

public class DaoImplV3 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur ");
        double data= 60;
        return data;
    }
}
