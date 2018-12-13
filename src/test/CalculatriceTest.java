import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jikael FILOMIN M1 MIAGE
 */
public class CalculatriceTest {
    private static Calculatrice instance;
    public CalculatriceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        instance = new Calculatrice(6,2);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test de la méthode plus de la calculatrice.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int expResult = 8;
        int result = instance.plus();
        assertEquals(expResult, result);
    }

    /**
     * Test de la méthode moins de la calculatrice.
     */
    @Test
    public void testMoins() {
        System.out.println("moins");
        int expResult = 4;
        int result = instance.moins();
        assertEquals(expResult, result);
    }

    /**
     * Test de la méthode multiplier de la calculatrice.
     */
    @Test
    public void testFois() {
        System.out.println("fois");
        int expResult = 12;
        int result = instance.fois();
        assertEquals(expResult, result);
    }

    /**
     * Test de la méthode diviser de la calculatrice.
     */
    @Test
    public void testDiv1() {
        System.out.println("div");
        int expResult = 3;
        int result = instance.div();
        assertEquals(expResult, result);
    }
}