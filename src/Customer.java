// DO NOT ADD NEW METHODS OR DATA FIELDS!

class Customer {
	private int customerID;
	private int transactionTime;
	private int arrivalTime;
	// constructor to set customerID, transactionTime and arrivalTime
	Customer(int customerid, int duration, int arrivaltime) {
		// add statements
		this.customerID = customerid;
		this.transactionTime = duration;
		this.arrivalTime = arrivaltime;
	}

	int getTransactionTime() {
		return transactionTime;
	}

	int getArrivalTime() {
		return arrivalTime;
	}

	int getCustomerID() {
		return customerID;
	}

	public String toString() {
		return "customerID = " + customerID + ", transactionTime = "
				+ transactionTime + ", arrivalTime = " + arrivalTime;

	}

	public static void main(String[] args) {
		// quick check!
		Customer mycustomer = new Customer(1, 15, 18);
		System.out.println("Customer Info: " + mycustomer);
	}
}
