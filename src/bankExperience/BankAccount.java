package bankExperience;

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
	
 //pour un solde de compte bancaire il est courant d'utiliser le type double car il permet de stocker des valeurs précises
	private double  balance; 
	//liste pour stocker les transactions
	private ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
	
	//initialiser dabord la valeur initiale du solde du compte
	public  BankAccount( double initialBalance) {
		balance = initialBalance;
	}
	
	 public void deposit(double amount) {
	        balance += amount;
	        Date date = new Date();
	        transactionHistory.add(new Transaction(TransactionType.DEPOSIT, amount, balance, date));
	    }
	 
	 public void withdraw(double amount) {
	        balance -= amount;
	        Date date = new Date();
	        transactionHistory.add(new Transaction(TransactionType.WITHDRAWAL, amount, balance, date));
	    }
	 public ArrayList<Transaction> getTransactionHistory() {
			return transactionHistory;
		}
	 
	public double getBalance() {
		return balance;
	}
	
	 
}
