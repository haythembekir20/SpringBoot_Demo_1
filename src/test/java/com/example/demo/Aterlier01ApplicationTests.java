package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Produit;
import com.example.demo.repos.produitRepo;

@SpringBootTest
class Aterlier01ApplicationTests {

	@Autowired
	produitRepo ProdRepo ;
	
	@Test
	void saveProd()
	{
		Produit prod = new Produit("MSI",2500D,new Date(05/10/2021));
		
		ProdRepo.save(prod);
	}
	@Test
	void findAllProds() {
		
		List<Produit> prods  = ProdRepo.findAll();
		
		for (Produit p : prods)
		{
		System.out.println(p);
		}
	}
	
	@Test
	void findProdById()
	{
		Produit prod = ProdRepo.findById(1L).get();
		
		System.out.println(prod);
	}
	
	@Test
	void updateProd()
	{
		Produit prod = ProdRepo.findById(1L).get();
		prod.setPrixProduit(2400D);
		ProdRepo.save(prod);
	}
	
	@Test 
	void deleteProd()
	{
		ProdRepo.deleteById(1L);
	}
	

}
