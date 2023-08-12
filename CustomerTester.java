import java.util.ArrayList;
import java.util.List;

public class CustomerTester {

    public static void main(String[] args) {
        //creating an arrayList of type Customer
        List<Customer> customerList = new ArrayList<>(4);
        BusinessCustomer businessCustomer = new BusinessCustomer("Ronald", "Bagaporo", "Business Customer", 
        "Business Customer with Home Depot", 10, 3105.50);
        RetailCustomer retailCustomer  = new RetailCustomer("Vinayak", "Dev", "Retail Customer", 11200.00);
        PreferredCustomer preferredCustomer = new PreferredCustomer("Austin", "O’Neill",
         "Preferred Customer", 6456.85, 5);
         RetailCustomer retailCustomer2 =  new RetailCustomer("Vinay", "De Soni", "Retail Customer", 7890.00);
        customerList.add(businessCustomer);
        customerList.add(retailCustomer);
        customerList.add(preferredCustomer);
        customerList.add(retailCustomer2);

        System.out.println("Welcome to the Customer tester!");
        drawLine(86);
        System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
        drawLine(86);


         for(Customer customer : customerList){
            System.out.println(customer.toString());
            System.out.println();
         }
    }

    private static void drawLine(int n){

        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
