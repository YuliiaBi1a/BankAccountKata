package bankaccount;

import java.util.Random;

public class Account {
    //Attributes
    private String accountNumber;
    private double balance;

    //Constructor
    public Account() {
        this.accountNumber = createAccount();
        this.balance = 0;
    }

    //Method for create random account
    private String createAccount() {
        Random rnd = new Random();
        StringBuilder accountRandom = new StringBuilder("ES");
        for (int i = 0; i <= 22 ; i++) {
            accountRandom.append(rnd.nextInt(0, 10));
        }
       return accountRandom.toString();
    }

    //Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//Methods
    @Override
    public String toString() {
        return "Cuenta{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Double depositingMoney(int saldo){
        if (saldo > 0)
            this.balance += saldo;
        return this.balance;
    }

    public Double withdrawMoney(int withdrawAmount) {
        if (withdrawAmount <= this.balance && withdrawAmount > 0){
            this.balance -= withdrawAmount;
        }
        return this.balance;
    }
}
