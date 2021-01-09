package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessMockTest {

    @Test
    void testFindTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class); //Mock creation
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,16,3});
        SomeBusinessimpl businessimpl = new SomeBusinessimpl(dataServiceMock);
        int result = businessimpl.findTheGreatestFromAllData();
        assertEquals(16, result);
    }
    @Test
    void testFindTheGreatestFromAllData_oneValue() {
        DataService dataServiceMock = mock(DataService.class); //Mock creation
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22,16,3});
        SomeBusinessimpl businessimpl = new SomeBusinessimpl(dataServiceMock);
        int result = businessimpl.findTheGreatestFromAllData();
        assertEquals(22, result);
    }

}
