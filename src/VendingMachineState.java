public interface VendingMachineState {
    void insertMoney(int amount);
    void selectProduct(String product);
    void dispenseProduct();
}