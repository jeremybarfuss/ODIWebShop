package ch.hearc.ig.odi.webshop.business;

import java.util.HashMap;

/**
 *
 * @author jeremy.barfuss
 */
public class Cart {
    private HashMap<Integer, CartElement> productsList;

    public Cart() {
        this.productsList = new HashMap<>();
    }

    public HashMap<Integer, CartElement> getProductsList() {
        return productsList;
    }

    public void setProductsList(HashMap<Integer, CartElement> productsList) {
        this.productsList = productsList;
    }
    
    public void addProduct(Product product, Integer quantity) {
        this.productsList.put(product.getNumber(), new CartElement(product, quantity));
    }
    
    public void updateProduct(Product product, Integer quantity) {
        this.productsList.get(product.getNumber()).setQuantity(quantity);
    }
    
    public void removeProduct(Product product) {
        this.productsList.remove(product.getNumber());
    }
}
