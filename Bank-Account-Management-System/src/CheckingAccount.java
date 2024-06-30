public class CheckingAccount extends Account {
    // ATT
    private double overdraftLimit;
    // Constructor
    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    // method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdraftLimit += newBalance; // newBalance is negative
            }
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient amount, considering overdraft limit.");
        }
    }
    //setter and getter

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
