package application;

import java.util.Scanner;

public class CustomerBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Account chinmay = new Account("Chinmay Deshpande",01001);
		chinmay.menu();
		Account Krishna = new Account("Krishna Thapaliya",01002);
		Krishna.menu();*/
		Account akash = new Account("Akash Thapa",010);
		akash.menu();
		

	}

}

class Account {
	// class properties
	int balance;
	int pTranscations;
	String customerName;
	int customerId;

	// class constructor
	Account(String name, int CustomerId) {
		this.customerName = name;
		this.customerId = CustomerId;
	}

	// Method for Deposit
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			pTranscations = amount;
		}
	}

	// Method for withdraw
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			pTranscations = -amount;
		}
	}

	// Method showing previous Transcations
	void getPTranscations() {
		if (pTranscations > 0) {
			System.out.println("Deposited: " + pTranscations);
		} else if (pTranscations < 0) {
			System.out.println("Withdraw: " + Math.abs(pTranscations));
		} else {
			System.out.println("Error/Insufficent Transcation");
		}
	}

	// Method for interest calculating
	void calculateInterest(int yrs) {
		double interestRate = 0.05;
		double newBalance = (balance * interestRate * yrs) + balance;
		System.out.println("Current interest rate: " + (100 * interestRate));
		System.out.println("After " + yrs + " years, balance will be: " + newBalance);
	}

	// Method for main menu
	void menu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("WelCome, " + customerName + " !");
		System.out.println("Your Id: " + customerId);
		System.out.println();
		System.out.println("Please choose following service");
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit Amount");
		System.out.println("C. Make Withdraw");
		System.out.println("D. View Transcation");
		System.out.println("E. Calculate Interest");
		System.out.println("F. Exit");

		do {
			System.out.println();
			System.out.println("Enter your choose ");
			char option1 = sc.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();

			switch (option) {
			// balance
			case 'A':
				System.out.println("*********************************");
				System.out.println("Balance = $" + balance);
				System.out.println("*********************************");
				System.out.println();
				break;

			// deposit
			case 'B':
				System.out.println("Enter amount to Deposit: ");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println();
				break;

			// withdraw
			case 'C':
				System.out.println("Enter amount to Withdraw: ");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println();
				break;

			// view Transcation
			case 'D':
				System.out.println("*********************************");
				getPTranscations();
				System.out.println("*********************************");
				System.out.println();
				break;

			// calculate interest
			case 'E':
				System.out.println("Provide the years for Interest: ");
				int yrs = sc.nextInt();
				calculateInterest(yrs);
				break;

			case 'F':
				System.out.println("*********************************");
				break;
			default:
				System.out.println("Invalid Option. Please provide valid option");
				break;
			}

		} while (option != 'F');
		{
			System.out.println("Thank You for Banking with us !!!");

		}

	}

}
