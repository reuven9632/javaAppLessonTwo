package com.company;

public class Array1 implements Array{
    int array[] = new int[10];
    int elementArray = 0;

    @Override
    public int getElementArray(int i) {
        return array[i];
    }

    @Override
    public boolean addElementArray(int val) {
        if (elementArray != array.length) {
            array[elementArray] = val;
            elementArray++;
            return true;
        }
        else
            return false;
    }
}
