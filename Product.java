public class Product {
    private String name;
    private int price;
    private static int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getQuantity(String productName) {
        return quantity;
    }
}
