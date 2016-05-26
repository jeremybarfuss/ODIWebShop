package ch.hearc.ig.odi.webshop.presentation.beans;

import ch.hearc.ig.odi.webshop.business.Cart;
import ch.hearc.ig.odi.webshop.business.CartElement;
import ch.hearc.ig.odi.webshop.business.Product;
import ch.hearc.ig.odi.webshop.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author jeremy.barfuss
 */
@Named(value = "productsBean")
@SessionScoped
public class ProductsBean implements Serializable {

    @Inject
    Services services;
    private Cart cart;
    private Integer quantityToAdd = 1;
    
    /**
     * Creates a new instance of ProductsBean
     */
    public ProductsBean() {
        this.cart = new Cart();
    }

    public List<CartElement> getProductsInCart() {
        return new ArrayList(cart.getProductsList().values());
    }
    
    public List<Product> getProducts() {
        return services.getProductsList();
    }
    
    public void addProduct(Product product) {
        this.cart.addProduct(product, 1);
    }
    
    public void updateProduct() {
        
    }
    
    public void deleteProduct(CartElement cartElement) {
        this.cart.removeProduct(cartElement.getProduct());
    }
}
