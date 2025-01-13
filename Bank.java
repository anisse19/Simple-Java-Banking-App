import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<User> users;
/*		User: Especifica o tipo de dado que o método espera. Aqui, ele aceita apenas objetos da classe User.
	    user: É o nome da variável que representa o objeto sendo passado ao método. Ele é utilizado dentro do método para se referir ao objeto fornecido. */
public Bank() {
    this.users = new ArrayList<>();
}

public void registerUser(String userId, String name) {
    users.add(new User(userId, name));
    System.out.println("User registered successfully!");
}

public User findUserById(String userId) {
    for (User user : users) {
        if (user.getUserId().equals(userId)) {
            return user;
        }
    }
    return null;
}

public void addAccountToUser(String userId, String accountId, String accountType, double balance) {
    User user = findUserById(userId);
    if (user != null) {
        Account newAccount = new Account(accountId, accountType, balance);
        user.addAccount(newAccount);
        System.out.println("Account added successfully to user: " + userId);
    } else {
        System.out.println("User not found!");
    }
}

public void viewAccounts(String userId) {
    User user = findUserById(userId);
    if (user != null) {
        System.out.println("Accounts for " + user.getName() + ":");
        for (Account account : user.getAccounts()) {
            System.out.println(account);
        }
    } else {
        System.out.println("User not found.");
    }
}

public void depositToAccount(String userId, String accountId, double amount) {
    User user = findUserById(userId);
    if (user != null) {
        for (Account account : user.getAccounts()) {
            if (account.getAccountId().equals(accountId)) {
                account.deposit(amount);
                System.out.println("Deposit successful! New balance: " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    } else {
        System.out.println("User not found.");
    }
}}
