package com.jamiahus.jaycalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    //Buttons for main screen
    private Button myButton_0;
    private Button myButton_1;
    private Button myButton_2;
    private Button myButton_3;
    private Button myButton_4;
    private Button myButton_5;
    private Button myButton_6;
    private Button myButton_7;
    private Button myButton_8;
    private Button myButton_9;
    private Button myButton_plus;
    private Button myButton_minus;
    private Button myButton_divide;
    private Button myButton_dot;
    private Button myButton_delete;
    private Button myButton_equals;

    private TextView myCalculationDisplay;

    private String addDisplay = "+";

    private OperationNumber runningNumber;

    private OperationContainer Calculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runningNumber = new OperationNumber(OperationType.Number);
        Calculation = new OperationContainer();
        myCalculationDisplay = findViewById(R.id.editText_Calculation_Display);

        myButton_0 = findViewById(R.id.button_0);
        myButton_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "0";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_1 = findViewById(R.id.button_1);
        myButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "1";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_2 = findViewById(R.id.button_2);
        myButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "2";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_3 = findViewById(R.id.button_3);
        myButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "3";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_4 = findViewById(R.id.button_4);
        myButton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "4";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_5 = findViewById(R.id.button_5);
        myButton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "5";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_6 = findViewById(R.id.button_6);
        myButton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "6";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_7 = findViewById(R.id.button_7);
        myButton_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "7";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_8 = findViewById(R.id.button_8);
        myButton_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "8";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_9 = findViewById(R.id.button_9);
        myButton_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = "9";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_plus = findViewById(R.id.button_plus);
        myButton_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OperationBase buttonOperation = new OperationBase(OperationType.Add);
                OperationNumber numberToAdd = new OperationNumber(OperationType.Number);
                numberToAdd.SetRunningNumber(runningNumber.GetRunningNumber());
                if ( !Calculation.IsOpertationListEmpty()){
                    if (!Calculation.IsLastOperationAnumber()){
                        Calculation.AddOperationToList(numberToAdd);
                        Calculation.AddOperationToList(buttonOperation);
                        runningNumber.ClearRunningNumber();
                    }
                } else{
                    Calculation.AddOperationToList(numberToAdd);
                    Calculation.AddOperationToList(buttonOperation);
                    runningNumber.ClearRunningNumber();
                }
                UpdateCalculationDisplay();
            }
        });

        myButton_minus = findViewById(R.id.button_minus);
        myButton_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","-");
            }
        });

        myButton_divide = findViewById(R.id.button_divide);
        myButton_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","/");
            }
        });

        myButton_dot = findViewById(R.id.button_dot);
        myButton_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buttonValue = ".";
                AppendNumberToRunningNumber(buttonValue);
                UpdateCalculationDisplay();
            }
        });

        myButton_delete = findViewById(R.id.button_delete);
        myButton_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!runningNumber.GetRunningNumber().isEmpty()){
                    //Start
                    runningNumber.UnAppendNumberToRunningNumber();
                    Log.d("After Delete: ", runningNumber.GetRunningNumber());
                }
            }
        });

        myButton_equals = findViewById(R.id.button_equals);
        myButton_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!runningNumber.IsRunningNumberEmpty()){
                    OperationNumber numberToAdd = new OperationNumber(OperationType.Number);
                    numberToAdd.SetRunningNumber(runningNumber.GetRunningNumber());
                    Calculation.AddOperationToList(numberToAdd);
                    runningNumber.ClearRunningNumber();
                }
                UpdateCalculationDisplay();
                DisplayCalculationOnDisplay();
                Calculation.ClearCalculationList();

                //TODO: Determine if it is best to clear the calcuation variable should be cleared as well. I am thinking that the calculation
            }
        });
    }

    private void UpdateCalculationDisplay(){
        //TODO: Need to add a method that wil clear the calculation display once a calculation has been displayed
        String displayText = " ";
        for (int i = 0; i < Calculation.ListOfOperations.size(); i++){
            OperationBase currentBase = Calculation.ListOfOperations.get(i);
            if (currentBase.GetOperationType() == OperationType.Number){
                OperationNumber number = (OperationNumber) currentBase;
                displayText +=  number.GetRunningNumber();
            } else if (currentBase.GetOperationType() == OperationType.Add){
                displayText +=  addDisplay;
            }
        }

        displayText += runningNumber.GetRunningNumber();
        myCalculationDisplay.setText(displayText);
    }

    private void DisplayCalculationOnDisplay(){
        myCalculationDisplay.setText(Calculation.CalculateEquation());
    }

    private void AppendNumberToRunningNumber(String buttonValue){

        if (!runningNumber.GetRunningNumber().isEmpty()){
            runningNumber.AppendNumberToRunningNumber(buttonValue);
        } else if (!buttonValue.equals("0")){
            if (buttonValue.equals(".") & !runningNumber.IsDecimalPresent()){
                runningNumber.SetRunningNumber(buttonValue);
            } else if (!buttonValue.equals(".")){
                runningNumber.SetRunningNumber(buttonValue);
            }
        }
    }
}
