/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sig.e.SIGE;

/**
 *
 * @author Anderson Tonon
 */
public class JUnitTest {
    
    SIGE sig = new SIGE();
    
    public JUnitTest() {
    }
    
    @Test
    public void CT1_1() {
        assertTrue(11 == SIGE.Printar(10));

    }
}
