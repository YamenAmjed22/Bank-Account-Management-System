import java.util.ArrayList;
import java.util.List;

public class Bank {
    // ATT
    private List<Account> accounts;

    // constructor
    public Bank() {
        this.accounts = new ArrayList<>();
    }



    // methods
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("The Account added " + account);
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account; //return make exit from function
            }
        }
        return null;
    }

    public void viewAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

