package bankExperience;

import java.util.Date;

public class Transaction {
	
	private TransactionType transaction; //trasactionType is an enum
	private double Amount;
	private double newBalance; //solde aprés la transaction
	private Date transactionDate;
	public Transaction(TransactionType transaction, double amount, double newBalance, Date transactionDate) {
		super();
		this.transaction = transaction;
		Amount = amount;
		this.newBalance = newBalance;
		this.transactionDate = transactionDate;
	}
	public TransactionType getTransaction() {
		return transaction;
	}
	public void setTransaction(TransactionType transaction) {
		this.transaction = transaction;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public double getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	

}
