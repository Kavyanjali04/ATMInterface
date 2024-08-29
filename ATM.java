public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }
}
