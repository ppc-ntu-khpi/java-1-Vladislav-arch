
public class Сustomer 
{
    public Сustomer()
    {
        ID = 1;
        isNew = true;
        total = 1000;
    }
    private int ID;
    private Boolean isNew;
    private double total;
    
    public void displayCustomerInfo()
    {
        System.out.println("ID: " + ID);
        System.out.println("Client status: " + isNew);
        System.out.println("Total purchases are:: " + total);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
