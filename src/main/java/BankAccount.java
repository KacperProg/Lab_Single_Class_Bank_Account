public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int deposit(int amount){

        this.balance += amount;
        return balance;
    }
    public int withdraw(int amount){

        this.balance -= amount;
        return balance;

    }

    public int payInterest(){

        this.balance = (int) (this.balance*1.05);
        return balance;
    }

}
