import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Kacper", "Nowak", "09/12/2000,", 500);
    }

    @Test
    public void canDeposit() {
        int expected = 100;
        int actual = bankAccount.deposit(100);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canWithdraw() {
        int expected = -50;
        int actual = bankAccount.withdraw(50);
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void payIntrest(){
        int expected = 105;
        int actual = bankAccount.deposit(100);
        actual = bankAccount.payInterest();
        assertThat(actual).isEqualTo(expected);

    }
}