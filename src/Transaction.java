import java.util.Scanner;

public class Transaction {

	public void checkout(Customer c) {
		double transactionTotal; 
		System.out.println("Please enter transaction total (format XXXX.XX)");
		try (Scanner in = new Scanner(System.in)) {
			transactionTotal = in.nextDouble();
		}
		System.out.println("Transaction verified. Adding loyalty points...");
		
		int points = (int)transactionTotal;
		points *= .55;
		addPoints(c, points);
	}
	
	public void addPoints(Customer c, int newPoints) {
		c.setPointTotal(newPoints += c.getPointTotal());
	}
	
	public void showPointShop() {
		System.out.println("Reward 1: 20 points");
		System.out.println("Reward 2: 50 points");
		System.out.println("Reward 3: 100 points");
		System.out.println("Reward 4: 500 points");
	}
	
	public void removePoints(Customer c, int newPoints) {
		c.setPointTotal(newPoints -= c.getPointTotal());
	}
}
