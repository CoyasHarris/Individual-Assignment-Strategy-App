package malcolm.strategy;

public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(double price) {
         String totalSum = String.format("%.2f", price);
        System.out.println("Paid $" + totalSum + " with cash!!!");
    }

}
