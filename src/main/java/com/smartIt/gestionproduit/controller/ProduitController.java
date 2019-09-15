package com.smartIt.gestionproduit.controller;

import com.smartIt.gestionproduit.entitie.Produit;
import com.smartIt.gestionproduit.services.ProduitService;
import com.smartIt.gestionproduit.services.ProduitServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProduitController {
    private  ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/allproducts")
    public List<Produit> findallproduct(){
        return produitService.getList();
    }


    
    @GetMapping("/oneproduct/{id}")
    //1-bash njib produit mn bd hia nssayfto id dyal produit f url  o tanmshiw la methode findoneproduct tan9ololha rah jay wa7d l param id
    public Produit findoneproduct(@PathVariable Long id){
        return produitService.getOneProduit(id).get();
    }


}
