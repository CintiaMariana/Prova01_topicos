package br.edu.univas.CintiaMarianaOliveira;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.univas.si7.topicos.product.entities.ProductEntity;
import br.edu.univas.si7.topicos.product.reposioties.ProductRepository;
import br.univas.CintiaMarianaOliveira.entities.SupplierEntity;



@SpringBootApplication
public class CintiaMarianaOliveiraApplication implements CommandLineRunner{
	
	@Autowired
	private SupplierRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CintiaMarianaOliveiraApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		SupplierEntity s1 = new SupplierEntity();
		repo.save(s1);
		SupplierEntity s2 = new SupplierEntity();
		repo.save(s2);
		
		List<SupplierEntity> suppliers = repo.findAll();
		System.out.println(suppliers);
	}

}
