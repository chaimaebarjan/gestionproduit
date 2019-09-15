package com.smartIt.gestionproduit.services;

import com.smartIt.gestionproduit.entitie.Produit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProduitService {
    List<Produit> getList();

    Optional<Produit> getOneProduit(Long id);

    Produit addList(Produit p);

    Produit update(Produit id);

    void delete(Long id);

}
