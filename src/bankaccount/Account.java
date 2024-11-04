package bankaccount;

import java.util.Random;

public class Account {
    private String countNumber;
    private double saldo;

    public Account() {
        Random rnd = new Random();
        String cuentaRandom = "ES";
        for (int i = 0; i <= 22 ; i++) {
            cuentaRandom += rnd.nextInt(0,10);
        }
        this.countNumber = cuentaRandom;
        this.saldo = 0;
    }

    public String getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(String countNumber) {
        this.countNumber = countNumber;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "countNumber='" + countNumber + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public Double depositingMoney(int saldo){
        if (saldo > 0){
            this.saldo = saldo;
        }
        return this.saldo;
    }

    public Double withdrawMoney(int withdrawAmount) {
        if (withdrawAmount <= this.saldo && withdrawAmount > 0){
            this.saldo -= withdrawAmount;
        }
        return this.saldo;
    }
}
