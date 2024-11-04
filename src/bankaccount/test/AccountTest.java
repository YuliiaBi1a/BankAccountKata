package bankaccount.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import bankaccount.Account;

public class AccountTest {

    // Test for depositingMoney
    @Test
    @DisplayName("Test depositingMoney with positive amount")
    public void testDepositingMoneyPositiveAmount() {
        Account account = new Account();
        account.depositingMoney(100);
        assertEquals(100, account.getSaldo(), "Saldo should be 100 after depositing 100");
    }

    @Test
    @DisplayName("Test depositingMoney with negative amount")
    public void testDepositingMoneyNegativeAmount() {
        Account account = new Account();
        account.depositingMoney(-50);
        assertEquals(0, account.getSaldo(), "Saldo should remain 0 after attempting to deposit a negative amount");
    }

    // Test for withdrawMoney
    @Test
    @DisplayName("Test withdrawMoney with valid amount")
    public void testWithdrawMoneyValidAmount() {
        Account account = new Account();
        account.depositingMoney(100);
        account.withdrawMoney(50);
        assertEquals(50, account.getSaldo(), "Saldo should be 50 after withdrawing 50 from 100");
    }

    @Test
    @DisplayName("Test withdrawMoney with amount greater than balance")
    public void testWithdrawMoneyExceedsBalance() {
        Account account = new Account();
        account.depositingMoney(100);
        account.withdrawMoney(150); // Спроба зняти більше, ніж є на рахунку
        assertEquals(100, account.getSaldo(), "Saldo should remain 100 after attempting to withdraw more than the balance");
    }

    @Test
    @DisplayName("Test withdrawMoney with negative amount")
    public void testWithdrawMoneyNegativeAmount() {
        Account account = new Account();
        account.depositingMoney(100);
        account.withdrawMoney(-30); // Спроба зняти негативну суму
        assertEquals(100, account.getSaldo(), "Saldo should remain 100 after attempting to withdraw a negative amount");
    }

    // Test for getSaldo
    @Test
    @DisplayName("Test getSaldo returns initial saldo of 0")
    public void testGetSaldoInitial() {
        Account account = new Account();
        assertEquals(0, account.getSaldo(), "Initial saldo should be 0");
    }

    @Test
    @DisplayName("Test getSaldo after depositing money")
    public void testGetSaldoAfterDeposit() {
        Account account = new Account();
        account.depositingMoney(100);
        assertEquals(100, account.getSaldo(), "Saldo should be 100 after deposit");
    }

    @Test
    @DisplayName("Test getSaldo after withdrawing money")
    public void testGetSaldoAfterWithdraw() {
        Account account = new Account();
        account.depositingMoney(100);
        account.withdrawMoney(50);
        assertEquals(50, account.getSaldo(), "Saldo should be 50 after withdrawal of 50 from 100");
    }

    @Test
    @DisplayName("Test getSaldo after invalid withdrawal")
    public void testGetSaldoAfterInvalidWithdraw() {
        Account account = new Account();
        account.depositingMoney(100);
        account.withdrawMoney(150);
        assertEquals(100, account.getSaldo(), "Saldo should remain 100 after invalid withdrawal of 150");
    }
}