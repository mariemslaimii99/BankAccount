package bankExperience;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class bankExperienceTest {
//deposit test 
	@Test
	 public void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0); // depot de 50
        assertEquals(150.0, account.getBalance(), 0.0); //verifier si le solde totale egale à 150
        Transaction lastTransaction = account.getTransactionHistory().get(account.getTransactionHistory().size() - 1);//récuperer  la derniere transaction effectuée
        assertEquals(TransactionType.DEPOSIT, lastTransaction.getTransaction()); //verifier si la dérniere transaction sagit d'un dépot
        assertEquals(50.0, lastTransaction.getAmount(), 0.0);
        assertEquals(150.0, lastTransaction.getNewBalance(), 0.0);
    }

//withdrawal test
	@Test
	public void testWithdrawal() {
	    BankAccount account = new BankAccount(200.0);
	    account.withdrawal(50.0);
	    assertEquals(150.0, account.getBalance());
	    Transaction lastTransaction = account.getTransactionHistory().get(account.getTransactionHistory().size() - 1);
	    assertEquals(TransactionType.WITHDRAWAL, lastTransaction.getTransaction());
	    assertEquals(50.0, lastTransaction.getAmount());
	}
	
//History
	@Test
	public void testGetTransactionHistory() {
	    BankAccount account = new BankAccount(1000.0);
	    account.deposit(500.0);
	    account.withdrawal(200.0);
	    ArrayList<Transaction> transactionHistory = account.getTransactionHistory();
	    assertEquals(2, transactionHistory.size());
	    assertEquals(TransactionType.DEPOSIT, transactionHistory.get(0).getTransaction());//vérifier si la premiere transaction s'agit d'un depot
	    assertEquals(500.0, transactionHistory.get(0).getAmount(), 0.0);
	    assertEquals(TransactionType.WITHDRAWAL, transactionHistory.get(1).getTransaction());//vérifier si la premiere transaction s'agit d'un withdrawal
	    assertEquals(200.0, transactionHistory.get(1).getAmount(), 0.0);
	}
}
