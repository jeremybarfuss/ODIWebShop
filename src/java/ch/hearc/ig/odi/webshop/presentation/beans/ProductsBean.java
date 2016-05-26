package ch.hearc.ig.odi.webshop.presentation.beans;

import ch.hearc.ig.odi.webshop.business.Cart;
import ch.hearc.ig.odi.webshop.business.CartElement;
import ch.hearc.ig.odi.webshop.business.Product;
import ch.hearc.ig.odi.webshop.services.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author jeremy.barfuss
 */
@Named(value = "productsBean")
@RequestScoped
public class ProductsBean {

    @Inject
    Services services;
    
    /**
     * Creates a new instance of ProductsBean
     */
    public ProductsBean() {
    }

    
    public List<Product> getProducts() {
        return services.getProductsList();
    }
}
