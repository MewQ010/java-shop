import java.util.*;
public abstract class Shop {
    private LinkedList<Product> products = new LinkedList<>();
    protected int price = 0;
    protected static int minimumQuantity;
    protected static double discount;
    protected void Discount(int minimumQuantity, double discount) {
        this.minimumQuantity = minimumQuantity;
        this.discount = discount;
    }
    protected double buyProduct(int quantity, double originalPrice) {
        return quantity * originalPrice;
    }
    protected void addProduct(String productName, int price, int quantity) { // додати продукт в наявність магазину
        products.add(new Product(productName, price, quantity));
    }

    protected int getPrice(String productName) { // отримати ціну продукта
        for(Product product : products) {
            if(product.getName().equals(productName)) {
                return product.getPrice();
            }
        }
        return 0;
    }
    protected boolean containsProduct(String productName) { // отримати назву продукта
        for(Product product : products) {
            if(product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    protected Set<String> getAllProducts() { // отримати всі назві продуктів
        return products.keySet();
    }
}
