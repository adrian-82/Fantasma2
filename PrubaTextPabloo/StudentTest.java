

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void TestPrueba()
    {
        int entrada = 5;
        int resultadoEsperado = 10;
        int resultado = Student.prueba(entrada);
        
        assertEquals(resultado, resultadoEsperado);
        
        entrada = 4;
        resultadoEsperado = 10;
        resultado = Student.prueba(entrada);
        
        assertEquals(resultado, resultadoEsperado);
    }
    
    @Test
    public void TestPrueba2()
    {
        int entrada = 4;
        int resultadoEsperado = 10;
        int resultado = Student.prueba(entrada);
        
        assertEquals(resultado, resultadoEsperado);
    }
}

