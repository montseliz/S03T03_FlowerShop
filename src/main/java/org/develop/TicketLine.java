package org.develop;

public class TicketLine {
    Product product;
    int quantity;
    public TicketLine (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "{" + "product= " + product.toString() + ", quantity=" + quantity + "}\n";
    }
}
