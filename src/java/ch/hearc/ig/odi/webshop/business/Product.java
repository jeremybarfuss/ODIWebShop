package ch.hearc.ig.odi.webshop.business;

/**
 *
 * @author jeremy.barfuss
 */
public class Product {

    private int number;
    private String name;

    /**
     * Constructeur parametré de Produit
     *
     * @param numero Numéro du produit
     * @param nom Nom du produit
     */
    public Product(int numero, String nom) {
        this.number = numero;
        this.name = nom;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
