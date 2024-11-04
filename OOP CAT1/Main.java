package BankDemo;

public class accountMain {
    public static void main(String[] args) {
        Account account1 = new Account(12345, 1000.0, 500.0, 1000.0);
        Account account2 = new Account(54321, 500.0, 300.0, 800.0);

        account1.deposit(200.0);
        account1.withdraw(800.0); // Within credit limit
        account1.withdraw(1600.0); // Exceeds credit limit
        account1.transferTo(account2, 300.0);
    }
}