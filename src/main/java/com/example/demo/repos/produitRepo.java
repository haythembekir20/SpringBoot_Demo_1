package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Produit;

public interface produitRepo extends JpaRepository<Produit, Long> {

}
