package gt.edu.url.examen1;


import static org.junit.Assert.*;

import org.junit.Test;

import gt.edu.url.examen1.api.Demo;
import gt.edu.url.examen1.impl.DemoImpl;

/**
 *
 * @author tuxtor
 */
public class DemoUnitTest {
    
    public DemoUnitTest() {
    }
    
    @Test
    public void hello() {
        Demo demoTest = new DemoImpl();
        
        assertEquals("Hola Mundo",demoTest.saludar());
    }
}
