import static org.junit.Assert.*;
import org.junit.Test;

public class FizzyPrinterTest {

    @Test
    public void testFizz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(9, false));
    }

    @Test
    public void testBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Buzz", fizzyPrinter.printFizzy(10, false));
    }

    @Test
    public void testBang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(14, false);
        assertEquals("Bang", result);
    }

    @Test
    public void testFizzbuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(15, false);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testFizzbuzzbang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(105, false);
        assertEquals("FizzBuzzBang", result);
    }

    @Test
    public void testBoom() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(8, false);
        assertEquals("Boom", result);
    }

    @Test
    public void testUpperCase() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String result = fizzyPrinter.printFizzy(105, true);
        assertEquals("FIZZBUZZBANG", result);
    }
}

