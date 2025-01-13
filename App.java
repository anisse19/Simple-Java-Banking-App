import java.util.Scanner;

public class App{
    public static void main(String[]args){
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Banking App!");

    while (true) {
        System.out.println("Menu:");
        System.out.println("1. Register User");
        System.out.println("2. Create Account");
        System.out.println("3. Deposit Money");
        System.out.println("4. View Accounts");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
     
            case 1:
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                bank.registerUser(userId, name);
                break;

            case 2:
                System.out.print("Enter User ID: ");
                String uid = scanner.nextLine();
                System.out.print("Enter Account ID: ");
                String accountId = scanner.nextLine();
                System.out.print("Enter Account Type (e.g., Savings, Checking): ");
                String accountType = scanner.nextLine();
                System.out.print("Enter Initial Balance: ");
                double balance = scanner.nextDouble();
                bank.addAccountToUser(uid, accountId, accountType, balance);
                break;

            case 3:
                System.out.print("Enter User ID: ");
                String depositUserId = scanner.nextLine();
                System.out.print("Enter Account ID: ");
                String depositAccountId = scanner.nextLine();
                System.out.print("Enter Amount to Deposit: ");
                double amount = scanner.nextDouble();
                bank.depositToAccount(depositUserId, depositAccountId, amount);
                break;

            case 4:
                System.out.print("Enter User ID: ");
                String viewUserId = scanner.nextLine();
                bank.viewAccounts(viewUserId);
                break;

            case 5:
                System.out.println("Thank you for using the Banking App. Goodbye!");
                scanner.close();
                return;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    }
