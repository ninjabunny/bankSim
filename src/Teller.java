import java.util.PriorityQueue;
import java.util.Random;

// DO NOT ADD NEW METHODS OR DATA FIELDS!

class Teller {

	// teller id and current customer
	private int tellerID;
	private Customer currentCustomer;

	// start time and end time of current interval
	private int startTime;
	private int endTime;

	// for keeping statistical data
	private int totalFreeTime;
	private int totalBusyTime;
	private int totalCustomers;

	// Constructor
	Teller() {
		// add statements
	}

	// Constructor with teller id
	Teller(int tellerId) {
		// add statements
		this.tellerID = tellerId;
		// totalCustomers = 0;
	}

	// accessor methods

	int getTellerID() {
		return tellerID;
	}

	Customer getCustomer() {
		// add statements
		return currentCustomer;
	}

	// Transition from free interval to busy interval
	void freeToBusy(Customer currentCustomer, int currentTime) {
		// goal : switch from free interval to busy interval
		// i.e. end free interval, start busy interval
		// to serve a new customer
		//
		// steps : update totalFreeTime

		// set startTime, endTime, currentCustomer,
		this.currentCustomer = currentCustomer;
		this.startTime = currentCustomer.getArrivalTime();
		
		//this might be wrong, unsure
		this.endTime = currentTime + currentCustomer.getTransactionTime();

		// update totalCustomers
		totalCustomers++;
		// add statements
	}

	// Transition from busy interval to free interval
	Customer busyToFree() {
		// goal : switch from busy interval to free interval
		// i.e. end busy interval to return served customer,
		// start free interval

		// steps : update totalBusyTime
		totalBusyTime = getEndBusyIntervalTime();
		// set startTime
		this.startTime = currentCustomer.getArrivalTime();
		// return currentCustomer DONE

		// add statements
		return currentCustomer;
	}

	// Return end busy time, use by priority queue
	int getEndBusyIntervalTime() {
		// add statements
		return 0;
	}

	// Use this method at the end of simulation to update teller time
	void setEndIntervalTime(int endsimulationtime, int intervalType) {
		// for end of simulation
		// set endTime,
		// for free interval (0), update totalFreeTime
		if (intervalType == 0) {
			totalFreeTime += endsimulationtime;
		}
		// for busy interval (1), update totalBusyTime
		if (intervalType == 1) {
			totalBusyTime += endsimulationtime;
		}
		// add statements
	}

	// functions for printing teller's statistics :
	void printStatistics() {
		// print teller statistics, see project statement
		System.out.println("\t\tTeller ID                : " + tellerID);
		System.out.println("\t\tTotal free time          : " + totalFreeTime);
		System.out.println("\t\tTotal busy time          : " + totalBusyTime);
		System.out.println("\t\tTotal # of customers     : " + totalCustomers);
		if (totalCustomers > 0)
			System.out.format("\t\tAverage transaction time : %.2f%n\n",
					(totalBusyTime * 1.0) / totalCustomers);
	}

	public String toString() {
		return "tellerID=" + tellerID + ":startTime=" + startTime + ":endTime="
				+ endTime + ">>currentCustomer:" + currentCustomer;
	}

	public static void main(String[] args) {
		// quick check
		Customer mycustomer = new Customer(1, 11, 8);
		System.out
				.println("======================================================");
		System.out.println(mycustomer);
		Teller myteller = new Teller(5);
		myteller.freeToBusy(mycustomer, 13);
		System.out.println(myteller);
		mycustomer = myteller.busyToFree();
		System.out
				.println("======================================================");
		System.out.println(myteller);
		System.out.println(mycustomer);
		System.out
				.println("======================================================");

	}

};
