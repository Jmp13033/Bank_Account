import java.util.Random;
public class BankAccount {
    // Atributes class bank account
    private String accountNumber = number();
    private Double checkingBalance = 0.0;
    private Double savingsBalance = 0.0;
    private static int account = 0;
    private static Double totalMoney = 0.0;

    
    // constructors for each person 
    public  BankAccount() {
        Double checkingBalance = 0.0;
        Double savingsBalance = 0.0;
        account += 1;
        System.out.println("New user created acount number:..." + accountNumber + ".");
		System.out.println("Total accounts created: " + account + ".");	

    }



    public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	//Setters for each method
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance; // this.
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance; // this.
	}


    // method for the account random account  
    private String number() {
        String numbersInAccount = "0123456789";
        String randNumber = "";
        Random random = new Random();


		for(int i = 0; i < 10; i++) {
			char num = numbersInAccount.charAt(random.nextInt(10));
			randNumber += num;
		}
		accountNumber = randNumber;
		return randNumber;





    }
    
    public Double myBalance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}

	public void deposit(String account, Double amount) {
		if(account == "Checking" || account=="checking") {
			setCheckingBalance(getCheckingBalance() + amount);

		}
		if(account == "Savings" || account=="savings") {
			setSavingsBalance(getSavingsBalance() + amount);

		}
		else {
			System.out.println("Select Proper account type");
			

		}
	}

	
	public void withdrawl(String account, Double amount) {
		if(account == "Checking" || account=="checking") {
			if(getCheckingBalance() < amount) {
				System.out.println("no money left");
			}
			else
			{
				setCheckingBalance(getCheckingBalance() - amount);

			}

		}
		if(account == "Savings" || account=="savings") {
			if(getSavingsBalance() < amount) {
				System.out.println("no money left in account ");
			}
			else
			{
				setSavingsBalance(getSavingsBalance() - amount);

			}
			

		}
		else {
			System.out.println("Select Proper account type");
			

		}
	}




    
}
