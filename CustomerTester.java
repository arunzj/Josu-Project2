import java.util.ArrayList;
import java.util.List;

public class CustomerTester {

    public static void main(String[] args) {
        //creating an arrayList of type Customer
        List<Customer> customerList = new ArrayList<>(4);
        BusinessCustomer businessCustomer = new BusinessCustomer("Ronald", "Bagaporo", "BusinessCustomer", 
        "Business Customer with Home Depot", 10, 3105.50);
        RetailCustomer retailCustomer  = new RetailCustomer("Vinayak", "Dev", "RetailCustomer", 11200.00);
        PreferredCustomer preferredCustomer = new PreferredCustomer("Austin", "O’Neill",
         "PreferredCustomer", 6456.85, 5);
         RetailCustomer retailCustomer2 =  new RetailCustomer("Vinay", "De Soni", "RetailCustomer", 7890.00);
        customerList.add(businessCustomer);
        customerList.add(retailCustomer);
        customerList.add(preferredCustomer);
        customerList.add(retailCustomer2);

         for(Customer customer : customerList){
            System.out.println(customer.toString());
            System.out.println();
         }
    }
}
