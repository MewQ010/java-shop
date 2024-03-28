import java.util.LinkedList;
public class Street {
    LinkedList<Shop> allShops = new LinkedList<>(){{
        add(new TechShop());
        add(new ProductShop());
    }};
}
