package malcolm;

import malcolm.model.Cart;

public class MainClass {

   
    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.fillCart(5);
        cart.printCartItems();
         String totalSum = String.format("%.2f", cart.computeTotalPrice());
        System.out.println(">>Total Price of Cart:" +totalSum);
       
      
        //pay by selection the appropriate strategy
        cart.payTotal();
    }
    
    

}
