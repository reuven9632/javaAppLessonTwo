package com.company;

public class Array2 implements Array{
    int array[] = new int[5];
    int elementArray = 0;

    @Override                       //нужно добавлять как показатель что это описание метода интерфейса
    public int getElementArray (int i) {
        if (i < 0 && i > array.length) {
            System.out.println("Error 404");
            return 0;
        }
        else {
            return array[i];
        }
    }

    @Override                       //нужно добавлять как показатель что это описание метода интерфейса
    public boolean addElementArray (int val) {
        if (elementArray != array.length) {
            array[elementArray] = val;
            elementArray++;
            return true;
        }
        else
            return false;
    }
}
