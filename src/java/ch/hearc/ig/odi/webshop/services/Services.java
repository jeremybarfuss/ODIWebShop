package ch.hearc.ig.odi.webshop.services;

import ch.hearc.ig.odi.webshop.business.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author jeremy.barfuss
 */
@SessionScoped
@Stateful
public class Services implements Serializable {

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
