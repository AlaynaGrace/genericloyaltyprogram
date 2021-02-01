import java.util.Scanner;

public class loyaltyDriver {

	int choice;
	
	Customer cus1 = new Customer("Andria", 13549, 0);
	Customer cus2 = new Customer("Bandalar", 54684, 235);
	Customer cus3 = new Customer("Casper", 97618, 17);
	Customer cus4 = new Customer("Durand", 23461, 900);
		
	do {
		System.out.println("Welcome to the reward system menu.");
		System.out.println("Please select from the following options.");
		System.out.println("1: Show store");
		System.out.println("2: Check balance");
		System.out.println("3: Use points");
		System.out.println("0: Exit");
		
		try (Scanner in = new Scanner(System.in)) {
			choice = in.nextInt();
		}
		
		switch(choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 0:
				break;		
		}
		
	}
	while(choice != 0);
	
	System.out.println("Thank you for using the reward system.");
}
