public class ShoppingCart {
	
    public double calculateTotal(Payable item) {
        return item.getPrice();
    }

    public boolean checkItemName(Payable item) {
        return item.getName() != null;
    }
}