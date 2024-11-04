package bankaccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account);
//depositar dinero
        account.depositingMoney(50);
        System.out.println(account);
        account.depositingMoney(60);
        System.out.println(account);
// retirar dinero: si es un número negativo o mayor que saldo, el saldo no cambia
        account.withdrawMoney(10);
        System.out.println(account);
// consultar saldo
        System.out.println(account.getSaldo());
    }
}