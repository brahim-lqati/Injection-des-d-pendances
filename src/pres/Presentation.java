package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Presentation {

	public static void main(String[] args) {
		
		//notre presentation
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("./src/config.txt"));
			
			//déclaration dynamique
			//dao
			Class classDao = Class.forName(scanner.nextLine());
			IDao dao = (IDao) classDao.newInstance();
			
			//metier
			Class classMetier = Class.forName(scanner.nextLine());
			IMetier metier = (IMetier) classMetier.newInstance();
			metier.setDao(dao);
			int result = metier.converstion();
			System.out.println(result);
		} catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//c'est la déclaration dynamique
		
		

	}

}
