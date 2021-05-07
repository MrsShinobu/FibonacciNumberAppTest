package com.example.fibonaccinumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    CalcFormula temp = new CalcFormula();
    int selectedRadio = 1;


    public void onRadioButtonClicked(View view) {
        // если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        TextView resultField = (TextView) findViewById(R.id.resultField);
        // Получаем нажатый переключатель
        switch(view.getId()) {
            case R.id.cycle:
                if (checked){
                    selectedRadio = 0;
                }
                break;
            case R.id.recursion:
                if (checked){
                    selectedRadio = 1;
                }
                break;
        }
    }

    // Обработка нажатия кнопки
    public void calculateButtom(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        EditText editText = (EditText) findViewById(R.id.numberField);
        //editText.getText();
        int temp2 = Integer.parseInt(editText.getText().toString());
        double[] returnCalc = new double[temp2];
        String temp3;
        if(selectedRadio == 0) {
            returnCalc = temp.Fibbonaci(temp2);
            temp3 = "0";
            for (int i = 0; i < temp2; i++) {
                temp3 = temp3 + ", ";
                temp3 = temp3 + String.valueOf(returnCalc[i]);
            }
        }else if(selectedRadio == 1){
            temp3 = String.valueOf(temp.FibonacciRecurs(temp2));
        }else{
            temp3 = "Выберите способ расчёта";
        }



        resultField.setText(temp3);
    }
}