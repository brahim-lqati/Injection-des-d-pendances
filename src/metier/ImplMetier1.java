package metier;

import dao.IDao;

public class ImplMetier1 implements IMetier{

	private IDao dao;
	
	@Override
	public int converstion() {
		//fait appel à la couche métier // accées aux données
		
		//on va aussi aussi utiliser l'interface.
		return 5 * dao.getData();
	}

	@Override
	public void setDao(IDao dao) {
		
		this.dao = dao;
		
	}

}
