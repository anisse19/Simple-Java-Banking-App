
class Account {
private String accountId;
private String accountType;
private double balance;

public Account(String accountId, String accountType, double balance) {
    this.accountId = accountId;
    this.accountType = accountType;
    this.balance = balance;
}

public String getAccountId() {
    return accountId;
}

public double getBalance() {
    return balance;
}

public void deposit(double amount) {
    balance += amount;
}

}
