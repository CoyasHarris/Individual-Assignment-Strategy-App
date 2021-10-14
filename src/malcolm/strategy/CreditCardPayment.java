package malcolm.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String cardType;//Visa,Maestro, MasterCard
    private final String cardNumber;
    private final String cvv;
    private final int expirationYear;

    public CreditCardPayment(String cartType, String cartNumber, String cvv, int expirationYear) {
        this.cardType = cartType;
        this.cardNumber = cartNumber;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }

    @Override
    public void pay(double price) {
        String totalSum = String.format("%.2f", price);
        System.out.println("Paid $" + totalSum + " with Credit Card: " + this);
    }

    @Override
    public String toString() {
        return cardType + " Card Number: " + cardNumber + "  cvv: " + cvv + " expirationYear: " + expirationYear;
    }
}
