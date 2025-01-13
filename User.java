import java.util.List;
import java.util.ArrayList;
class User {
    private String userId;
    private String name;
    private List<Account> accounts;
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public String getName() {
        return name;
    }}
    