//package OOP.project;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;
    Scanner sc = new Scanner(System.in);

    public void checkpin() {
        System.out.println("Enter your pin: ");
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter the valid PIN!!!");
            checkpin(); // Reprompt for PIN
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Enter your Choice: ");
            System.out.println("1. Check A/C Balance ");
            System.out.println("2. Withdraw Money ");
            System.out.println("3. Deposit Money ");
            System.out.println("4. EXIT... ");

            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break; // Exit the loop
            } else {
                System.out.println("Enter a valid choice");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Money withdrawn");
        }
    }

    public void depositMoney() {
        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Money deposited successfully");
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
