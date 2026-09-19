import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    ShoppingCart cart;
    Product prod;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        prod = new Product("Laptop", 2500.0);
    }

    @Test
    void testGetPrice() {
        double price = cart.calculateTotal(prod);
        assertEquals(2500.0, price);
    }

    @Test
    void testGetName() {
        assertEquals("Laptop", prod.getName());
    }

    @Test
    void testCartNotNull() {
        assertNotNull(cart);
    }

    @Test
    void testProductNotNull() {
        assertNotNull(prod);
    }

    @Test
    void testPriceNotEqual() {
        assertNotEquals(1000.0, prod.getPrice());
    }

    @Test
    void testItemNameCheck() {
        boolean result = cart.checkItemName(prod);
        assertTrue(result);
    }
}