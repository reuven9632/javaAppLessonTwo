package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

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
        someDynamicArray.add(53446);
        someDynamicArray.add(5223);
        someDynamicArray.add(5);
        someDynamicArray.add(3);

        /*someDynamicArray.remove(2);//удатить конкретный эллемент массива,т.к. массив начинаеться с нуля то удалиться третий*/
        /*someDynamicArray.clear();//для того чтобы удалить все элементы массива*/


        for (Integer x : someDynamicArray) {//создал переменную типа Integer x (как и мой массив) ,
            // : someDynamicArray   -  и она (переменная х) будет получать данные с массива

            System.out.println(x);
        }



        //LinkedList ничем по большому счету не отличаеться от ArrayList кроме:
        // LinkedList быстрее записывает элементы в массив, а ArrayList быстрее их находит в массиве,
        // LinkedList можно выбирать случайные эллементы (rendom), а ArrayList такого нет
        LinkedList<String> someLinkedArray = new LinkedList<>();//в LinkedList не нужно писать в круглых скобках начальный размер массива

        someLinkedArray.add("Miki");
        someLinkedArray.add("Derekh");
        someLinkedArray.add("David");
        someLinkedArray.add("Rozy");


        someLinkedArray.add(2, "Fill");//для того чтобы добавить новый элемент масива в конкретную ячейку

        /*someLinkedArray.remove(2);//удатить конкретный эллемент массива,т.к. массив начинаеться с нуля то удалиться третий*/
        /*someLinkedArray.clear();//для того чтобы удалить все элементы массива*/


        for (Integer x : someLinkedArray) {//создал переменную типа Integer x (как и мой массив) ,
            // : someLinkedArray   -  и она (переменная х) будет получать данные с массива

            System.out.println(x);
        }
    }
}
