package Teste;

import static org.junit.Assert.*;
import org.junit.*;

import SIGE.SIGE;

/**
 *
 * @author Anderson Tonon
 */
public class JUnitTest {
    
    SIGE sig = new SIGE();
    
 
    @Test
    public void CT1_1() {
        assertTrue(11 == sig.Printar(10));

    }
}
