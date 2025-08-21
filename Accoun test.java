public class AccountTest {
    public static void main(String[] args) {
        // SavingsAccount
        SavingsAccount sa1 = new SavingsAccount();
        sa1.name = "Damien";
        sa1.deposit(1000);
        sa1.displayCustomer();
        
        double interest = sa1.calcInterest();
        System.out.println("Calculated Monthly Interest: " + interest);
        sa1.balance += interest;

        sa1.withdraw(500);  // Penarikan valid
        sa1.withdraw(600);  // Akan gagal karena saldo tidak cukup
        sa1.withdraw(-50);  // Akan gagal karena nilai negatif
    }
}