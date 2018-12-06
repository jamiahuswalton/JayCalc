package com.jamiahus.jaycalc;

import android.util.Log;

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

    public String CalculateEquation(){
        String result = "Error";
        float tempNumber;
        for (OperationBase calculationTpye: ListOfOperations) {
            if (calculationTpye.GetOperationType() == OperationType.Number){
                OperationNumber currentNumber = (OperationNumber)calculationTpye;
                tempNumber = Float.parseFloat(currentNumber.GetRunningNumber());
                Log.d("Calculation", String.valueOf(tempNumber));
            }
        }
        return result;
    }
}
