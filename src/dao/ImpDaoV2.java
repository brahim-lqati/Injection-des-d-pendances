package dao;

public class ImpDaoV2 implements IDao {

	@Override
	public int getData() {
		//exemple d'utilisation d'une autre implémentation
		System.out.println("version web service");
		int data = 100*2;
		return data;
	}

}
