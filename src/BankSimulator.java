

import java.util.*;
import java.io.*;

// You may add new functions or data in this class 
// You may modify any functions or data members here
// You must use Customer, Teller and ServiceArea
// to implement Bank simulator

class BankSimulator {

  // input parameters
  private int numTellers, customerQLimit;
  private int simulationTime, dataSource;
  private int chancesOfArrival, maxTransactionTime;

  // statistical data
  private int numGoaway, numServed, totalWaitingTime;

  // internal data
  private int customerIDCounter;   // customer ID counter
  private ServiceArea servicearea; // service area object
  private Scanner dataFile;	   // get customer data from file
  private Random dataRandom;	   // get customer data using random function

  // most recent customer arrival info, see getCustomerData()
  private boolean anyNewArrival;  
  private int transactionTime;

  // initialize data fields
  private BankSimulator()
  {
	// add statements
  }

  private void setupParameters()
  {
	// read input parameters
	// setup dataFile or dataRandom
	// add statements
  }

  // Refer to step 1 in doSimulation()
  private void getCustomerData()
  {
	// get next customer data : from file or random number generator
	// set anyNewArrival and transactionTime
	// add statements
  }

  private void doSimulation()
  {
	// add statements

	// Initialize ServiceArea

	// Time driver simulation loop
  	for (int currentTime = 0; currentTime < simulationTime; currentTime++) {

    		// Step 1: any new customer enters the bank?
    		getCustomerData();

    		if (anyNewArrival) {

      		    // Step 1.1: setup customer data
      		    // Step 1.2: check customer waiting queue too long?
                    //           customer goes away or enters queue
    		} else {
      		    System.out.println("\tNo new customer!");
    		}

    		// Step 2: free busy tellers, add to free tellerQ
    		// Step 3: get free tellers to serve waiting customers 
  	} // end simulation loop

  	// clean-up
  }

  private void printStatistics()
  {
	// add statements into this method!
	// print out simulation results
	// see the given example in README file 
        // you need to display all free and busy gas pumps
  }

  // *** main method to run simulation ****
  public static void main(String[] args) {
   	BankSimulator runBankSimulator=new BankSimulator();
   	runBankSimulator.setupParameters();
   	runBankSimulator.doSimulation();
   	runBankSimulator.printStatistics();
  }

}
