public class Main {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount("ACC101", "Aarav Sharma", 5000);
        BankAccount secondAccount = new BankAccount("ACC102", "Diya Menon", 3000);

        firstAccount.deposit(1500);
        firstAccount.withdraw(2000);
        firstAccount.withdraw(10000);
        firstAccount.checkBalance();
        firstAccount.displayDetails();

        secondAccount.deposit(1000);
        secondAccount.withdraw(500);
        secondAccount.checkBalance();
        secondAccount.displayDetails();
    }
}