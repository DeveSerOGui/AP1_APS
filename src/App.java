public class App {
    public static void main(String[] args) {
        VendingMachineFacade facade = new VendingMachineFacade();
        
        facade.insertMoneyAndSelectProduct(null, 5);
    }
}