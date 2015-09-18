/**
 * Created by Sifat on 9/18/2015.
 */
public class Customer {
    private String name;
    private String email;
    private char gender;

    public Customer(){
    }
    public Customer(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;

    }
    public Customer(String name){
        this.name=name;
    }
    String getName(){
        return  this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void print(){
        System.out.println( name +"(" + gender + ") at " + email);
    }
}

