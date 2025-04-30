public class Slip {
    private int salesPersonNumber;
    private int productNumber;
    private double totalPrice;
    Slip(int salesPersonNumber, int productNumber, double totalPrice) {
        this.salesPersonNumber = salesPersonNumber;
        this.productNumber = productNumber;
        this.totalPrice = totalPrice;
    }
    Slip(){
        this.salesPersonNumber = 0;
        this.productNumber = 0;
        this.totalPrice = 0;
    }
    public int getSalesPersonNumber() {
        return salesPersonNumber;
    }
    public void setSalesPersonNumber(int salesPersonNumber) {
        this.salesPersonNumber = salesPersonNumber;
    }
    public int getProductNumber() {

    }
    public void setProductNumber(int productNumber) {

    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
