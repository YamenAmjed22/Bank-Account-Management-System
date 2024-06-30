public class Main {
    public static void main(String[] args) {
        System.out.println("*** Welcome ***");
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount("001", "John Doe", 1000, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("002", "Jane Smith", 500, 200);

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        bank.viewAllAccounts();

        savingsAccount.deposit(200);
        savingsAccount.addInterest();
        savingsAccount.withdraw(150);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(300);
        checkingAccount.withdraw(700);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
    }
