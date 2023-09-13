public class VendingMachineFacade {
    private VendingMachine vendingMachine;

    public VendingMachineFacade() {
        vendingMachine = VendingMachine.getInstance();
    }

    public void insertMoneyAndSelectProduct(String product, int amount) {
        vendingMachine.selectProduct(product);
        vendingMachine.insertMoney(amount);
        vendingMachine.dispenseProduct();
    }
}