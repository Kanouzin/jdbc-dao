package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("XXX Teste: findById XXX");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\nXXX Teste 2: seller findByDepartmentId XXX\n");
		Department department = new Department(2, null); 
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
			System.out.println("\nXXX Teste 3: seller findAll XXX\n");
			list = sellerDao.findAll();
			for (Seller obj : list) {
				System.out.println(obj);
		}
	}
}	