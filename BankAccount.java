public class BankAccount {
    private String accId;
    private String holderFullName;
    private double currentFunds;

    public BankAccount(String accId, String holderFullName, double openingDeposit) {
        this.accId = accId;
        this.holderFullName = holderFullName;
        this.currentFunds = openingDeposit;
    }

    public void deposit(double incomingSum) {
        currentFunds = currentFunds + incomingSum;
        System.out.println("Deposited " + incomingSum + " into " + accId);
    }

    public void withdraw(double requestedSum) {
        if (requestedSum > currentFunds) {
            System.out.println("Insufficient balance in " + accId);
        } else {
            currentFunds = currentFunds - requestedSum;
            System.out.println("Withdrew " + requestedSum + " from " + accId);
        }
    }

    public void checkBalance() {
        System.out.println("Balance for " + accId + ": " + currentFunds);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accId);
        System.out.println("Account Holder Name: " + holderFullName);
        System.out.println("Balance: " + currentFunds);
    }
}