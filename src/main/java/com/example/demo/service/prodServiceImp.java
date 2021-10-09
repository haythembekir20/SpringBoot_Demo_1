package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Produit;
import com.example.demo.repos.produitRepo;

public class prodServiceImp  implements prodService{
	
	
	@Autowired
	produitRepo ProdRepo ;
	
	@Override
	public Produit saveProduit(Produit p) {
		return ProdRepo.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {	
		return ProdRepo.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		ProdRepo.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {

		ProdRepo.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		return ProdRepo.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return ProdRepo.findAll();
	}

}
