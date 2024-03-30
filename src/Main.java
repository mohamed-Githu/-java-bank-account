/**
 * A program that simulates basic operations in a bank account
 */
public class Main {
    /**
     * Program entry point
     * @param args argumnets passed from command line
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // create a bank account and deposit 1000
        System.out.println("Current balance: " + account.getBalance());
        account.deposit(5000); // deposit 5000 to balance
        System.out.println("Current balance: " + account.getBalance());
        account.withdraw(700); // withdraw 700 from balance
        System.out.println("Current balance: " + account.getBalance());
    }
}