package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessStubTest {

    @Test
    void testFindTheGreatestFromAllData() {
        SomeBusinessimpl businessimpl = new SomeBusinessimpl(new DataServiceStub());
        int result = businessimpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}
class DataServiceStub implements DataService{ //Stub

    @Override
    public int[] retrieveAllData() {
        return new int[] { 24, 6, 14 };
    }
}