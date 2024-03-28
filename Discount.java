//public class Discount {
//    private int minimumQuantity = 5;
//    private double discountPercentage = 20.0;
//
//    public Discount(int minimumQuantity, double discountPercentage) {
//        this.minimumQuantity = minimumQuantity;
//        this.discountPercentage = discountPercentage;
//    }
//
//    public double applyDiscount(int quantity, double originalPrice) {
//        if (quantity > this.minimumQuantity) {
//            int quantity2 = quantity - minimumQuantity;
//            double discountAmount = (quantity - quantity2) * originalPrice + (quantity2 * (originalPrice/100*discountPercentage));
//            return discountAmount;
//        } else {
//            return originalPrice * quantity;
//        }
//    }
//}
//
