package malcolm.model;

import java.util.ArrayList;
import java.util.List;
import malcolm.strategy.BankTransferPayment;
import malcolm.strategy.CashPayment;
import malcolm.strategy.CreditCardPayment;
import malcolm.strategy.PaymentStrategy;


public class Cart {

    private List<TShirt> tshirts;
    private PaymentStrategy paymentStrategy;

   public Cart() {
        System.out.println(">>>Creating cart!!!");
        tshirts = new ArrayList();
 
    }

    public void addTShirt(TShirt tshirt) {
        tshirts.add(tshirt);
    }

    public void removeTShirt(TShirt tShirt) {
        tshirts.remove(tShirt);
    }

    private List<TShirt> getTshirts() {
        return tshirts;
    }

    public double computeTotalPrice() {
        double sum = 0;
        for (TShirt t : tshirts) {
            sum += t.getPrice();
        }
        return sum;
    }

    public void payTotal() {
        double total = computeTotalPrice();
        if(total<50){
            paymentStrategy = new CashPayment();
        }else if(total<100){
            paymentStrategy = new CreditCardPayment("Visa","1234","321",2022);
        }else {
            paymentStrategy = new BankTransferPayment("Piraiws","123456789");
        }
        paymentStrategy.pay(total);
    }
    
    public  void fillCart(int numberOfTshirts){
        
        for(int i=0; i<numberOfTshirts;i++){
            TShirt tshirt=new TShirt();
              addTShirt(tshirt);
    }
}
    
    public void printCartItems(){
        System.out.println("Your cart contains the following t shirts:");
        for(TShirt t: tshirts){
            System.out.println(t);
        }
    }
}
