/**
 * A bank account offers the following functionalities: withdraw, deposit, getBalance
 */
public class BankAccount {
    private double balance;

    /**
     * Constructor that initializes the bank account with 0 balance.
     */
    public BankAccount() {
        this(0);
    }

    /**
     * Constructor that initializes the bank account with the provided balance.
     * @param balance initial amount to be added to the balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Add amount to the existing balance.
     * @param amount the amount that will be added to the balance
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Withdraw money from the existing balance.
     * @param amount the amount that will be withdrawn, and it has to be minor or equal to the balance
     */
    public void withdraw(double amount) {
        if (amount > this.balance)
            return;

        this.balance -= amount;
    }

    /**
     * View the current balance of the bank account.
     * @return current balance
     */
    public double getBalance() {
        return this.balance;
    }
}
