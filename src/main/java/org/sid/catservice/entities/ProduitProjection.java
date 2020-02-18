package org.sid.catservice.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1",types = Produit.class)
public interface ProduitProjection {

    public double getPrice();     //      http://localhost:8080/produits?projection=P1
    public String getDesignation();



}
