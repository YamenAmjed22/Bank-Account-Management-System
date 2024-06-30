public class SavingsAccount extends Account{
    // ATT
    private double interestRate;
    // constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // method
    public void addInterest(){
        double interest = getBalance() * (interestRate/100);
        deposit(interest);
        System.out.println("Interest add : " + interest);
    }
    // setter and getter
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
