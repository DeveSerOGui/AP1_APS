import java.util.HashMap;
import java.util.Map;

// Singleton para a máquina de venda automática
public class VendingMachine {
    private static VendingMachine instance;

    private VendingMachineState currentState;
    private Map<String, Integer> products; // Armazena os produtos e seus preços

    private VendingMachine() {
        // Inicialize o estado para o estado padrão
        currentState = new ReadyState();
        products = new HashMap<>();
        products.put("Coca-Cola", 5);
        products.put("Chips", 3);
        // Adicione mais produtos conforme necessário
    }

    public static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void selectProduct(String product) {
        currentState.selectProduct(product);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void changeState(VendingMachineState state) {
        currentState = state;
    }

    public int getProductPrice(String product) {
        return products.getOrDefault(product, 0);
    }

    public void deductProductPrice(String product) {
        int price = getProductPrice(product);
        if (price > 0) {
            products.put(product, price - 1);
        }
    }
}