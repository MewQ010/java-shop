class ProductShop extends Shop {
    @Override
    protected double buyProduct(int quantity, double originalPrice) {
        double price3 = 0;
        if (quantity > minimumQuantity) {
            int quantity2 = quantity - minimumQuantity;
            double priceMon = originalPrice/100*discount;
            double discountAmount = ((quantity - quantity2) * originalPrice) + (quantity2 * (originalPrice - priceMon));
            price3 = discountAmount;
        } else {
            price3 = originalPrice * quantity;
        }
        if(Husband.getMoney() > price3) {
            return price3;
        } else {
            System.out.println("No money");
            return 0;
        }
    }
    public ProductShop() { // магазин продуктів
        addProduct("Apple", 300, 10); // добавляємо продукти
        addProduct("Bread", 110, 5);
        addProduct("Sausage", 80, 10000);
        addProduct("Butter", 70, 8);
        addProduct("Milk", 300, 2);
        addProduct("Potato", 40, 3);

        Discount(5, 20.0);
    }
}
