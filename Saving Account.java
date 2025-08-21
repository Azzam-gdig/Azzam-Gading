public class SavingsAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Error: Penarikan tidak boleh negatif.");
        } else if (balance < amount) {
            System.out.println("Error: Saldo tidak cukup untuk penarikan.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo baru: " + balance);
        }
    }

    public double calcInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}
