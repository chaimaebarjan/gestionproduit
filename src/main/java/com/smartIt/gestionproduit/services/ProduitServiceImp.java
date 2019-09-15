package com.smartIt.gestionproduit.services;

import com.smartIt.gestionproduit.entitie.Produit;
import com.smartIt.gestionproduit.repo.ProduitRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional // si je veux que les methodes soient transactionnel(tadar une operation automatiquement lokhra khassha tahia dar genre b3d produit alors automatiquement stock in9ss)
public class ProduitServiceImp implements ProduitService {


    private ProduitRepo produitrepo;

    public ProduitServiceImp(ProduitRepo produitrepo) {
        this.produitrepo = produitrepo;
    }


    @Override
    public List<Produit> getList() {
        return produitrepo.findAll();
    }

    @Override
    public Optional<Produit> getOneProduit(Long id) {
        return produitrepo.findById(id);
    }


    @Override
    public Produit addList(Produit p) {
        return produitrepo.save(p);
    }

    @Override
    public Produit update(Produit p) {
       Produit produit= produitrepo.findById(p.getId()).get();
       produit.setNom(p.getNom());
       produit.setPrix(p.getPrix());
       return produitrepo.save(produit);
    }


    @Override
    public void delete(Long id) {
        produitrepo.deleteById(id);
    }
}
