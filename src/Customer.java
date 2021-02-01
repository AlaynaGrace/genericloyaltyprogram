public class Customer {
	
	String name;
	int IDNumber;
	int pointTotal;
	
	public Customer(String n, int IDN, int pT) {
		name = n;
		IDNumber = IDN;
		pointTotal = pT;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	public int getPointTotal() {
		return pointTotal;
	}

	public void setPointTotal(int pointTotal) {
		this.pointTotal = pointTotal;
	}
	
}
