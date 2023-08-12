public class RetailCustomer extends Customer{

    private double totalPurchases;

    public RetailCustomer(String firstName, String lastName, String customerLevel,double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.totalPurchases = totalPurchases;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    
    public int findDiscountRate(){
        if(totalPurchases>10000){
            return 15;
        }else if(totalPurchases>5000){
            return 10;
        }else if(totalPurchases>1000){
            return 5;
        }else{
            return 0;
        }
    }
    
    @Override
    public double incentives() {
        return totalPurchases*(findDiscountRate()/(double)100);
       
    }
    @Override
    public String toString() {
        String fmtStr = String.format("\n%-20s$%s\n%-20s%s%%\n%-20s$%s\n%-20s$%s",
        "Total Purchases:",totalPurchases,"Discount Rate:",findDiscountRate(),"Discount Incentive:",incentives(),"Net Purchases:",totalPurchases-incentives());
        return super.toString()+fmtStr;
    }

}
