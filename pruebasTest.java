

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebasTest
{
    /**
     * Default constructor for test class pruebasTest
     */
    public pruebasTest()
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
    public void probar()
    {
        int resultadoEsperado = 6;
        int resultado = pruebas.paraProbar(5);
        assertEquals(resultadoEsperado, resultado);
    }
}

