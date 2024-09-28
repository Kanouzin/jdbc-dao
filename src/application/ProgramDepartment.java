package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("XXX Teste 1: Insert XXX");
		Department newDepartment = new Department(null, "Teatro");
		departmentDao.insert(newDepartment);
		System.out.println("Novo Id Inserido: " + newDepartment.getId());
		
		
		System.out.println("XXX Teste 2: Update XXX");
		Department dep = departmentDao.findById(1);
		dep.setName("Filme");
		departmentDao.update(dep);
		System.out.println("Atualização Concluída!");
		
		
		System.out.println("XXX Teste 3: Delete XXX");
		System.out.print("Insira o Id para deletar: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deletado com Sucesso!");
		
		sc.close();
		
		System.out.println("XXX Teste 4: FindbyId XXX");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);

		System.out.println("XXX Teste 5: FindAll XXX");
		List<Department> list = departmentDao.findAll();
		for (Department e : list) {
			System.out.println(e);
		}

	}
}
