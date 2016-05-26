/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.webshop.services;

import ch.hearc.ig.odi.webshop.business.Product;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jeremy.barfuss
 */
public class Services {
    private Map<Integer, Product> products;
    
    public Services() {
        products = new LinkedHashMap<>();
        products.put(1, new Product(1, "Ecran"));
        products.put(2, new Product(2, "Processeur"));
        products.put(3, new Product(3, "Carte graphique"));
        products.put(4, new Product(4, "Memoire vive"));
    }
    
    public List<Product> getProductsList() {
        return new ArrayList(products.values());
    }
    
    public Product getProductByNumber(int number) {
        return this.products.get(number);
    }
}
