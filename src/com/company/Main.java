package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");



        int someArray[] = new int[4];//создание обычного массива с четыря ячейками памяти

        ArrayList<Integer> someDynamicArray = new ArrayList<>();
        //создаю динамический массив ArrayList у которого в таких <> скобках передаеться параметр  переменной которая будетв нем храниться
        // в данном случае это int но нужно писать полное название Integer, так же как и String и т.п., затем название переменной, выделить
        // память с помощью new ArrayList<> (в ранней версии нужно было в таких <> скобках передать параметр Integer,но сейчас можно оставить их пустыми),
        // а в круглых передаеться изначальный размер массива, причем неважно что он будет позже больше или меньше тут просто выделяеться изначальный обьем памяти

        someDynamicArray.add(53);
        someDynamicArray.add(564);
        someDynamicArray.add(53);
        someDynamicArray.add(53);
        someDynamicArray.add(53);
        someDynamicArray.add(53);
        someDynamicArray.add(53);


        for (Integer x : someDynamicArray) {//создал переменную типа Integer x (как и мой массив) ,
            // : someDynamicArray   -  и она (переменная х) будет получать данные с массива

            System.out.println(x);
        }

    }
}
