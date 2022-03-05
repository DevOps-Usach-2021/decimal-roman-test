package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalToRomanoTest {
    @Test
    public void testDecToRoman(){
        assertEquals("I", NumeroRomano.decToRomano(1));
        assertEquals("VII", NumeroRomano.decToRomano(7));
        assertEquals("XI", NumeroRomano.decToRomano(11));
        assertEquals("XXI", NumeroRomano.decToRomano(21));
        assertEquals("XXXIII", NumeroRomano.decToRomano(33));
        assertEquals("XLIX", NumeroRomano.decToRomano(49));
        assertEquals("LIX", NumeroRomano.decToRomano(59));
        assertEquals("LXIX", NumeroRomano.decToRomano(69));
        assertEquals("LXXVIII", NumeroRomano.decToRomano(78));
        assertEquals("LXXXVI", NumeroRomano.decToRomano(86));
        assertEquals("XCIII", NumeroRomano.decToRomano(93));
        assertEquals("XCIX", NumeroRomano.decToRomano(99));
        assertEquals("C", NumeroRomano.decToRomano(100));      
    }
}
