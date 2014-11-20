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
public class Vector3DTest {
    
    public Vector3DTest() {
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
     * Test of length method, of class Vector3D.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(6,3,6);
        double expResult = 9.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(4,1,3);
        Vector3D instance = new Vector3D(2,5,7);
        Vector3D expResult = new Vector3D(6,6,10);;
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplyByScalar method, of class Vector3D.
     */
    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 3.0;
        Vector3D instance = new Vector3D(2,5,7);
        Vector3D expResult = new Vector3D(6,15,21);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
    }

    /**
     * Test of dotProduct method, of class Vector3D.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(3,1,4);
        Vector3D instance = new Vector3D(2,5,7);
        double expResult = 39.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of crossProduct method, of class Vector3D.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(3,1,4);
        Vector3D instance = new Vector3D(2,5,7);
        Vector3D expResult = new Vector3D(13,13,-13);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Vector3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(2,5,7);
        String expResult = "[2.0, 5.0, 7.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Vector3D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(2,3,4);
        Vector3D instance = new Vector3D(2,3,4);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
    }
}
