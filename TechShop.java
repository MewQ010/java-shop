class TechShop extends Shop {
    @Override
    protected double buyProduct(int quantity, double originalPrice) {
        Discount(200, 20.0);
        double price3 = 0;
        price3 = quantity * originalPrice;
        if(price3 > discount) {
            price3 = price3 - (price3/100*discount);
        }
        if(Husband.getMoney() > price3) {
            return price3;
        } else {
            System.out.println("No money");
            return 0;
        }
    }
    public TechShop() {  // магазин техніки
        addProduct("Sony", 100, 30); // добавляємо продукт
        addProduct("Samsung", 80, 6);
        addProduct("Sharp", 70, 40);
        addProduct("Aser", 40, 30);
    }
}

