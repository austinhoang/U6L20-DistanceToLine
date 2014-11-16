

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DistanceToLineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DistanceToLineTest
{
    /**
     * Default constructor for test class DistanceToLineTest
     */
    public DistanceToLineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetDist1()
    {
        assertEquals(2.6359, DistanceToLine.getDist(-0.3, 0.5, 1, -6.84, -3.03), 0.1);
    }

    @Test
    public void testGetDist2()
    {
        assertEquals(1.9261, DistanceToLine.getDist(1.8, -0.7, 1, 2.25, 1.9), 0.1);
    }

    @Test
    public void testGetDist3()
    {
        assertEquals(0, DistanceToLine.getDist(0, 0, 5, 3, 7), 0.1);
    }

    @Test
    public void testGetDist4()
    {
        assertEquals(55.6255, DistanceToLine.getDist(-.2, -.7, 34.6, -9.88, -5.6), 0.1);
    }

    @Test
    public void testGetDist5()
    {
        assertEquals(1.3333, DistanceToLine.getDist(0, 3, 2, 4, -2), 0.1);
    }

    @Test
    public void testGetDist6()
    {
        assertEquals(2.5, DistanceToLine.getDist(4, 0, -2, 3, -2), 0.1);
    }
}




