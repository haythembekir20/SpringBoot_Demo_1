package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Produit;

public interface prodService {
	
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();

}
