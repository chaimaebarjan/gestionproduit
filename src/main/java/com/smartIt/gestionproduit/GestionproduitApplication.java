package com.smartIt.gestionproduit;

import com.smartIt.gestionproduit.entitie.Produit;
import com.smartIt.gestionproduit.repo.ProduitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class GestionproduitApplication implements CommandLineRunner {
	ProduitRepo produitRepo;

	public GestionproduitApplication(ProduitRepo produitRepo) {
		this.produitRepo = produitRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(GestionproduitApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Produit produit = new Produit();
		produit.setPrix(3000f);
		produit.setNom("laptop");
		produitRepo.save(produit);


	}
}
