package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piotr Nazar
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of length method, of class Vector2D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector2D instance = new Vector2D(3,4);
        double expResult = 5.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of add method, of class Vector2D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D anotherVector = new Vector2D(1,2);
        Vector2D instance = new Vector2D(3,4);
        Vector2D expResult = new Vector2D(4,6);
        Vector2D result = instance.add(anotherVector);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplyByScalar method, of class Vector2D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 3.0;
        Vector2D instance = new Vector2D(3,4);
        Vector2D expResult = new Vector2D(9,12);
        Vector2D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
    }

    /**
     * Test of dotProduct method, of class Vector2D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector2D anotherVector = new Vector2D(2,1);;
        Vector2D instance = new Vector2D(3,4);
        double expResult = 10.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Vector2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(5,7);
        String expResult = "[5.0, 7.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Vector2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector2D(2,2);
        Vector2D instance = new Vector2D(2,2);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
    }
    
}
