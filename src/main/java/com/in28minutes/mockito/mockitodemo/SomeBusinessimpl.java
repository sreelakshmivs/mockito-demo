package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessimpl {
    private DataService dataService;

    public SomeBusinessimpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value: data){
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
//SomeBusinessimpl uses the below interface

