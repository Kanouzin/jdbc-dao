package application;

import java.util.Date;
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
				
				System.out.println("\nXXX Teste 4: seller Insert XXX\n");
				Seller newSeller = new Seller(null, "Joao", "Joao@gmail.com", new Date(), 4000.0, department);
				sellerDao.insert(newSeller);
					System.out.println("Novo Id inserido: " + newSeller.getId());
	
					System.out.println("\nXXX Teste 5: seller Update XXX\n");
					seller = sellerDao.findById(1);
					seller.setName("Joao Ninguem");
					sellerDao.update(seller);
						System.out.println("Atualização Completa");
		}
	
	}	