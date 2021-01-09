package com.in28minutes.mockito.mockitodemo;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class) //We need this annotation for mock annotations to work

public class SomeBusinessMockAnnotationsTest {
    //To make mock creation more easier, use this annotation
    @Mock
    DataService dataServiceMock;
    @InjectMocks
    SomeBusinessimpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
        //DataService dataServiceMock = mock(DataService.class); //Mock creation
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,16,3});
        //SomeBusinessimpl businessimpl = new SomeBusinessimpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(16, result);
    }
    @Test
    public void testFindTheGreatestFromAllData_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22,16,3});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(22, result);
    }

}
