package com.jamiahus.jaycalc;

import java.util.ArrayList;
import java.util.List;

/*
* The purpose of this class is to hold the operations and perform the actual calculations.*/
public class OperationContainer {
    List<OperationBase> ListOfOperations = new ArrayList<>();

    public OperationContainer(){
    }

    public void AddOperationToList(OperationBase newOperation){
        ListOfOperations.add(newOperation);
    }

    public boolean IsLastOperationAnumber(){
        int totalElements = ListOfOperations.size();
        OperationBase element = ListOfOperations.get(totalElements -1);
        return element.GetOperationType() == OperationType.Number;
    }

    public boolean IsOpertationListEmpty(){
        return ListOfOperations.size() == 0;
    }
}
