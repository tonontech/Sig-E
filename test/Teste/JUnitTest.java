package Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.junit.Assert.*;
import org.junit.Test;

import sig.e.SIGE;

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
