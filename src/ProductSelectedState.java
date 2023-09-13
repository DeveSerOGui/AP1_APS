public class ProductSelectedState implements VendingMachineState {
    private String selectedProduct;

    public ProductSelectedState(String product) {
        this.selectedProduct = product;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Dinheiro inserido: " + amount);
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Você já selecionou um produto.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensando " + selectedProduct);
    }
}
