
public class СustomerTest 
{
   public static void main(String args[]) {
        Сustomer customer1 = new Сustomer();
        customer1.setID(324);
        customer1.setTotal(120.4);
        customer1.setIsNew(Boolean.FALSE);
        
        System.out.println("ID: " + customer1.getID());
        System.out.println("Client status: " + customer1.getIsNew());
        System.out.println("Total purchases are:: " + customer1.getTotal());
    }
}
