public class ReadyState implements VendingMachineState {
    @Override
    public void insertMoney(int amount) {
        System.out.println("Dinheiro inserido: " + amount);
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Selecione um produto primeiro.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Nenhum produto selecionado.");
    }
}