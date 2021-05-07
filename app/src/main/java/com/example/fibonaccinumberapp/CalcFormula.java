package com.example.fibonaccinumberapp;

public class CalcFormula {
    double[] Fibbonaci(int n){
        double prev = 0d, next = 1d, result = 0d;
        double[] returnCalc = new double[n];
        returnCalc[0] = 1;
        for (int i = 1; i < n; i++) {
            returnCalc[i] = prev + next;
            prev = next;
            next = returnCalc[i];
        }
        return returnCalc;
    }

    double FibonacciRecurs (int n)  {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return FibonacciRecurs(n - 1) + FibonacciRecurs(n - 2);
    }

}
