package com.jamiahus.jaycalc;

public class OperationBase {
    private OperationType myType;

    public OperationBase(OperationType type){
        myType = type;
    }

    public OperationType GetOperationType(){
        return myType;
    }
}
