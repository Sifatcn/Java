/**
 * Created by Sifat on 9/18/2015.
 */
public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;

    public Account(){
        this.balance = 0;
    }
    public Account(Customer customer,int accountNumber,double balance){
        this.customer =customer;
        this.accountNumber=accountNumber;
        this.balance = balance;
    }

    public String getBranch(){
        return this.branch;
    }

    public void setBranch(String branch){
        this.branch=branch;
    }
    public Account(Customer customer,int accountNumber,String branch){
        this.customer=customer;
        this.accountNumber= accountNumber;
        this.branch=branch;
        this.balance=0;
    }
    public Customer getCustomer(){
        return this.customer;
    }

    public String getCustomerName(){
        return this.customer.getName();
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }

    public double getBalance(){
        return balance=balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double debit(double x){
        if (x>balance){
            System.out.println ("Amount withdrawn exceeds the current balance!");
            return balance;
        }
        balance-=x;
        return this.balance;
    }
    public double credit(double x){
        balance+=x;
        return this.balance;
    }


    public void print(){
        System.out.println("Customer: "+ customer.getName()+ " Branch: "+branch+ " A/C no: "+ accountNumber + " Balance: " + balance);
    }
}
