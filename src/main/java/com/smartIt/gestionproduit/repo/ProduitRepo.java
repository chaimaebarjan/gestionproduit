package com.smartIt.gestionproduit.repo;

import com.smartIt.gestionproduit.entitie.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
