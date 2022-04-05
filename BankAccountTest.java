class BankAccountTest{
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();

        user1.deposit("savings", 77.8);
        user1.withdrawl("savings", 88.0);
        user1.getCheckingBalance();
        user1.myBalance();
        user2.myBalance(); 

    
    
    }
    

}
