public class BusinessCustomer extends Customer{

    
    public BusinessCustomer(String firstName, String lastName, String customerLevel,String companyName,int discountRate,double totalPurchases) {
        super(firstName, lastName, customerLevel);
        this.companyName=companyName;
        this.discountRate=discountRate;
        this.totalPurchases=totalPurchases;
    }
    
    String companyName;
    int discountRate;
    double totalPurchases;
    
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public int getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
    public double getTotalPurchases() {
        return totalPurchases;
    }
    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    }
    @Override
    public double incentives() {
        return totalPurchases*(discountRate/(double)100);
       
    }
    @Override
    public String toString() {
        String fmtStr = String.format(" for %s\n%-20s$%s\n%-20s%s%%\n%-20s$%s\n%-20s$%s",
        companyName,"Total Purchases:",totalPurchases,"Discount Rate:",discountRate,"Discount Incentive:",incentives(),"Net Purchases:",totalPurchases-incentives());
        return super.toString()+fmtStr;
    }

}
