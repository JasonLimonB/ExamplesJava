package com.practicas.enumeraciones;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsingEnumsTest {


    @Test
    public void testGetDestinationSortTypeNameValidOutputName() {
        DestinationSortType type = DestinationSortType.E;
        assertNotNull(type.name());
        assertEquals("E",type.name());
    }

    @Test
    public void testGetDestinationSortTypeValueValidOutputValue() {
        DestinationSortType type = DestinationSortType.E;
        assertNotNull(type.getValue());
        assertEquals("EMPTY", type.getValue());
    }

    @Test
    public void testGetServiceTypeCodeMnemonicTextValidOutputName(){
        ServiceTypeCodeMnemonicText service = ServiceTypeCodeMnemonicText.ONE_DA;
        assertNotNull(service.name());
        assertEquals("ONE_DA", service.name());
    }

    @Test
    public void testGetServiceTypeCodeMnemonicTextValidOutputValue(){
        ServiceTypeCodeMnemonicText service = ServiceTypeCodeMnemonicText.ONE_DA;
        assertNotNull(service.getValue());
        assertEquals("1DA", service.getValue());
    }

}