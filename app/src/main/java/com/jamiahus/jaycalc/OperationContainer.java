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
        String finalResult = "Error";
        float runningResultNumber = 0.0f;

        for (int i = 0; i < ListOfOperations.size(); i++){

            OperationBase calculationTpye = ListOfOperations.get(i);
            if (i != ListOfOperations.size()-1){
                if(calculationTpye.GetOperationType() == OperationType.Add){
                    OperationNumber nextNumber = (OperationNumber) ListOfOperations.get(i+1);
                    float nextNumberFloat = Float.parseFloat(nextNumber.GetRunningNumber());
                    runningResultNumber += nextNumberFloat;
                }
            } else if (i == 1 & i != ListOfOperations.size()-1){
                if (calculationTpye.GetOperationType() == OperationType.Add){
                    OperationNumber previousNumber = (OperationNumber) ListOfOperations.get(i-1);
                    OperationNumber nextNumber = (OperationNumber) ListOfOperations.get(i+1);
                    float previousNumberFloat = Float.parseFloat(previousNumber.GetRunningNumber());
                    float nextNumberFloat = Float.parseFloat(nextNumber.GetRunningNumber());
                    runningResultNumber = previousNumberFloat + nextNumberFloat;
                }
                //TODO: Need to add code to handle the different operations (e.g., Add, subtract, etc.)
            } else {
                runningResultNumber = //TODO: Need to finish
            }
        }
        Log.d("Results", String.valueOf(runningResultNumber));
        return String.valueOf(runningResultNumber);
    }
}
