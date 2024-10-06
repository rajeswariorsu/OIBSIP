import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleATM {
    private static String userId = "user123"; // Predefined user ID
    private static String userPin = "1234"; // Predefined PIN
    private static double balance = 10000.00; // Initial balance in INR
    private static List<String> transactionHistory = new ArrayList<>(); // To store transaction history

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        // User authentication
        System.out.print("Enter User ID: ");
        String inputId = scanner.nextLine();
        System.out.print("Enter User PIN: ");
        String inputPin = scanner.nextLine();

        if (authenticate(inputId, inputPin)) {
            boolean exit = false;

            while (!exit) {
                System.out.println("\nATM Functions:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Transfer");
                System.out.println("4. Transaction History");
                System.out.println("5. Quit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        withdraw(scanner);
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        transfer(scanner);
                        break;
                    case 4:
                        printTransactionHistory();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } else {
            System.out.println("Authentication failed! Please check your User ID and PIN.");
        }

        System.out.println("Thank you for using the ATM. Goodbye!");
        scanner.close();
    }

    private static boolean authenticate(String inputId, String inputPin) {
        return inputId.equals(userId) && inputPin.equals(userPin);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: INR " + amount);
            System.out.println("Withdrawal successful! New balance: INR " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        transactionHistory.add("Deposited: INR " + amount);
        System.out.println("Deposit successful! New balance: INR " + balance);
    }

    private static void transfer(Scanner scanner) {
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Transferred: INR " + amount);
            System.out.println("Transfer successful! New balance: INR " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    private static void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
