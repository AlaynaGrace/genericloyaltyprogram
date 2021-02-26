//Parent(s): Customer, Products, Location
//Children: none

import java.util.*;
//import java.util.Scanner;

public class Transaction {

	int transactionID;
	int date;  //MMDDYYYY
	ArrayList<Product> products;
	float subtotal;
	float tax;
	float discounts;
	//payType paymentType;
	LoyaltyAccount loyalty;
	Redeemer redeemer;
	
	public Transaction(int tID, int dt, ArrayList<Product> p, float s, float t, float d, LoyaltyAccount l, Redeemer r) {
		transactionID = tID;
		date = dt;
		products = p;
		subtotal = s;
		tax = t;
		discounts = d;
		//paymentType = pT;
		loyalty = l;
		redeemer = r;
	}

	//Getters and setters
	
	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getDiscounts() {
		return discounts;
	}

	public void setDiscounts(float discounts) {
		this.discounts = discounts;
	}

	public LoyaltyAccount getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(LoyaltyAccount loyalty) {
		this.loyalty = loyalty;
	}

	public Redeemer getRedeemer() {
		return redeemer;
	}

	public void setRedeemer(Redeemer redeemer) {
		this.redeemer = redeemer;
	}
	
	//Methods
	
	void addProduct(Product newProduct) { //move to Product class?
		
	}
	
	void applyLoyalty(LoyaltyAccount appAcc) {
		
	}
}
