public class Account {
    //Att
    private String accountNumber;
    private String accountHolderName;
    private double balance ;
    // constructor

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    //Method
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Thanks you are deposit " + amount +"JD");
        }
        else {
            System.out.println("invalid deposit , the amount you want to deposit must be more than 0 " );
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Thanks you are withdraw " + amount + "JD");
        } else {
            System.out.print("invalid withdraw , ");
            if (amount>balance){
                System.out.println("the amount more than your balance ");
            }
            else {
                System.out.println("the amount must be more than 0 ");

            }
        }
    }
    // setter and getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // to string

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
