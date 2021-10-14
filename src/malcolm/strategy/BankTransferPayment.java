/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.strategy;


public class BankTransferPayment implements PaymentStrategy {

    private final String bank;
    private final String accountNumber;

    public BankTransferPayment(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }
    
    
    @Override
    public void pay(double price) {
        String totalSum = String.format("%.2f", price);
        System.out.println("Paid $" + totalSum  + " with Bank Transfer: " + this);
    }

    @Override
    public String toString() {
        return "Bank: " + bank + ", AccountNumber: " + accountNumber;
    }
    
    
}
