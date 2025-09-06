import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    public Account(int accountNumber, String accountHolderName, double balance, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\n------ Account Details ------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("------------------------------");
    }

    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated!");
    }
}

public class BankingApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account(101, "Krish", 5000, "krish@example.com", "9876543210");

        int choice;
        do {
            System.out.println("\n=== Banking Application ===");
            System.out.println("1. Deposit\n2. Withdraw\n3. Display\n4. Update Contact\n5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.displayAccountDetails();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("New Email: ");
                    String email = sc.nextLine();
                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();
                    acc.updateContactDetails(email, phone);
                    break;
                case 5:
                    System.out.println("Goodbye!");
            }
        } while (choice != 5);
        sc.close();
    }
}
