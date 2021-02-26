//Parent: none
//Children: Transaction

public class Product {

	double price;
	String productName;
	int productID;
	PointStrategy pointStrat;
	
	
	
	public Product(double p, String pN, int pID, PointStrategy pS) {
		price = p;
		productName = pN;
		productID = pID;
		pointStrat = pS;
	}

	//Getters and Setters

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public PointStrategy getPointStrat() {
		return pointStrat;
	}

	public void setPointStrat(PointStrategy pointStrat) {
		this.pointStrat = pointStrat;
	}
	
}
