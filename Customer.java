import java.util.Random;

public abstract class Customer {

    private String firstName;
    private String lastName;
    private String customerID; 
    private String customerLevel;

    public abstract double incentives();
    public  String toString(){
       return String.format("%s, %s %s", customerID,firstName,lastName);

    }

    public Customer(String firstName, String lastName, String customerLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerLevel = customerLevel;
        setCustomerID();
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    public String getCustomerID() {
        return customerID;
    }
    private void setCustomerID() {
        lastName=lastName.replaceAll("[^A-Za-z0-9]", "");
        String part1=null;
        Random rand = new Random();

        if(lastName.length()>=4){
            part1=lastName.substring(0, 4).toUpperCase();
        }else{
            part1 = String.format("%-4s", lastName).replace(" ", "X").toUpperCase();
        }

        customerID=part1+"_"+rand.nextInt(1000,9999);
    }
   
    public String getCustomerLevel() {
        return customerLevel;
    }
    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }
 
}
