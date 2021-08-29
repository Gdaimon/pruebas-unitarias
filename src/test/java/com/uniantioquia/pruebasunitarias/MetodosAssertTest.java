
package com.uniantioquia.pruebasunitarias;

import java.util.Date;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class MetodosAssertTest {

    @Test
    public void test(){
        
        // Equals
        //Assert.assertEquals(3,3);
        // Decimales -Delta
        //assertEquals("Decimales con delta: ", 2.29, 2.29, 0.02);
        // NotEquals
        assertNotEquals(3,2);
        // True
        assertTrue(true);
        // False
        assertFalse(false);
        // null
        assertNull(null);
        
        String textA = "Hola";
        String textB = "Hola";
        Assert.assertEquals(textA, textB);
        
        Date fechaA = new Date();
        Date fechaB = new Date();
        Assert.assertEquals(fechaA, fechaB);
        Assert.assertSame(fechaA, fechaB);
        
    }
    
}
