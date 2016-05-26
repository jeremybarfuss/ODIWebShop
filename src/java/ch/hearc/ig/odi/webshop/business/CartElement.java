package ch.hearc.ig.odi.webshop.business;

/**
 *
 * @author jeremy.barfuss
 */
public class CartElement {
    private Product product;
    private Integer quantity;

    public CartElement(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
}
