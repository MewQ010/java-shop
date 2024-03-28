import java.util.*;

public class Woman {
    private final LinkedList<Product> products = new LinkedList<>(); // список продуктів
    private LinkedList<String> canBuy = new LinkedList<>();
    private Map<String, Integer> toBuyAgain = new HashMap<>();
    private Map<String, Double> productPrice = new HashMap<>();

    public Woman(){
        products.add(new Product("Apple"));
        products.add(new Product("Sony"));
        products.add(new Product("Banana"));
    }
    protected int getCount(String productName) {
        return products.get(productName);
    }
    private void addProduct(String productName, Integer count) {
        products.put(productName, count); // додати продукт
    }

    protected LinkedList<Product> getAllProducts() { // отримати усі продукти
        return products;
    }

    protected void toBuy(){
        System.out.println("Треба купити :"); // Вивід списку для купівлі
        for (String productName : getAllProducts()) {
            System.out.println(productName + " - " + Product.getQuantity(productName) + " шт");
        }
    }

    protected void GoToFriend() {
        System.out.println("* Йдем хвастатись подрузі *");
        if(canBuy.size() >= products.size() - 1) {
            System.out.println("Вау, а ти знаєш що мій чоловік сьогодні накупив? Ні? Ну тоді дивись :");
        } else {
            System.out.println("Та мій чоловік лох, диви як мало продуктів купив :");
        }
        for(String i : canBuy) {
            System.out.println(i + " - " + getCount(i) + " шт - " + productPrice.get(i) + " грн");
        }
        System.out.println();
    }

    protected void GoShopAgain(){
        System.out.println("* Йдем знову до магазину *");
        System.out.println("Йди купи усі інші продукти, я оновила список, ось він :");
        toBuyAgain.put("Samsung", 2);
        toBuyAgain.put("Apple", 4);
        toBuyAgain.put("Butter", 3);
        for(String i : toBuyAgain.keySet()){
            System.out.println(i + " - " + toBuyAgain.get(i) + " шт");
        }
    }
}
