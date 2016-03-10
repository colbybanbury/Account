package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Account_Test {
	
	Account account;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
	
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testWithdraw() {
		double bal  = 20000-2500;
		try
	      {
	         System.out.println("\nWithdrawing $100...");
	         account.withdraw(2500.00);
	         System.out.println("\nWithdrawing $600...");
	         account.withdraw(100000.00);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"
	                                  + e.getAmount());
	         e.printStackTrace();
	      }
		assertEquals(account.getBalance(), bal, 0.01);
	}
	
	@Test
	public void testDeposit() {
		double bal  = account.getBalance();
		account.deposit(3000);
		assertEquals(account.getBalance(), bal + 3000, 0.01);
	}
	
	@Test
	public void testPrint() {
		System.out.println(account.getBalance());
		System.out.println(account.getMonthlyInterestRate());
		System.out.println(account.getdateCreated());
	}
	
	@Test
	public void  addCoverage(){
		Account a = new Account();
		a.setId(1);
		a.getId();
		a.setBalance(100);
		a.getAnnualInterestRate();
	}
	
		

}
