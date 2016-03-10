package base;
import java.util.*;



public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	Account(int ident, double bal) {
		id = ident;
		balance = bal;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) { //auto generated setters and getters
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return(annualInterestRate/12);
	}
	
	public void withdraw(double withdraw) throws InsufficientFundsException {
		if(withdraw <= balance){
			balance -= withdraw;
		}
		else{
			double needs = withdraw - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public void deposit(double deposit){
		balance += deposit;
	}
	
}
