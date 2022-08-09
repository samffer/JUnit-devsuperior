package entities;

public class Account {

	private static double DEPOSIT_FEE_PERCENTAGE = 0.02;
	
	private Long Id;
	private Double balance;
	public Account(Long id, Double balance) {
		super();
		Id = id;
		this.balance = balance;
	}
	public Account() {

	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
		amount = amount - amount * DEPOSIT_FEE_PERCENTAGE;
		balance = balance + amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException();
		}
		balance = balance - amount;
	}
	
	public double fullWithdraw() {
		double aux = balance;
		balance = 0.0;
		return aux;
	}
	
}
