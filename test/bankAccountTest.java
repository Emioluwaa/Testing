import org.junit.Test;

import static org.junit.Assert.*;

public class bankAccountTest {

    private bankAccount bankAccount;


    public void setUp() {

        bankAccount = new bankAccount("Chinedu Okafor", "0123456789", 5000.0);
    }

    @Test
    public void testInitialBalance() {
        assertEquals(5000.0, bankAccount.getBalance());
    }

    @Test
    public void testNegativeInitialBalanceDefaultsToZero() {
        bankAccount invalidBankAccount = new bankAccount("Test User", "1112223334", -500.0);
        assertEquals(0.0, invalidBankAccount.getBalance());
    }

    @Test
    public void testValidDeposit() {
        bankAccount.deposit(1500.0);
        assertEquals(6500.0, bankAccount.getBalance());
    }

    @Test
    public void testNegativeDepositThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(-200.0);
        });
    }

    @Test
    public void testValidWithdrawal() {
        bankAccount.withdraw(2000.0);
        assertEquals(3000.0, bankAccount.getBalance());
    }

    @Test
    public void testOverdraftThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            bankAccount.withdraw(10000.0);

    }


}
