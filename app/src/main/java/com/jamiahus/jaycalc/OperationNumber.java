package com.jamiahus.jaycalc;

import android.util.Log;

public class OperationNumber extends OperationBase {
    private String RunningNumber = "";

    public OperationNumber(OperationType type){
        super(type);
    }

    public void AppendNumberToRunningNumber(String appendedNumber){
        RunningNumber += appendedNumber;
        //Log.d("Append:", RunningNumber);
    }

    public boolean IsDecimalPresent(){
        return RunningNumber.contains(".");
    }

    public void UnAppendNumberToRunningNumber(){
        int lastIndexNumber = RunningNumber.length();
        RunningNumber = RunningNumber.substring(0,lastIndexNumber - 1);
    }

    public String GetRunningNumber() {
        return RunningNumber;
    }

    public void SetRunningNumber(String newValue){
        RunningNumber = newValue;
    }

    public void ClearRunningNumber(){
        RunningNumber = "";
    }

    public boolean IsRunningNumberEmpty(){
        return RunningNumber.isEmpty();
    }
}
