public class PreferredCustomer extends RetailCustomer{

    public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases,int cashbackRate) {
        super(firstName, lastName, customerLevel, totalPurchases);
        this.cashbackRate=cashbackRate;
    }

    private int cashbackRate;

    public int getCashbackRate() {
        return cashbackRate;
    }

    public void setCashbackRate(int cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public double incentives() {
        return super.incentives()+super.incentives()*(cashbackRate/(double)100);
    }

    @Override
    public String toString() {
        //TODO
            return super.toString()+String.format("\n%s%s%%","Cashback Rate:",cashbackRate);
    }
}
