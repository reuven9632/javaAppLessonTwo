package com.company;

import java.awt.*;
import java.awt.event.*;//библиотека отслеживания нажатия на кнопки
import javax.swing.*;//библиотека для созданитя формочек: надпись, кнопка, поле и ...



public class SimpleGUI extends JFrame{ //наследуем класс JFrame для созданитя формочек: надпись, кнопка, поле и ...
    private final JButton button = new JButton ("Press");//создаем кнопку с помощю библиотеки javax.swing.*класса JFrame,
    // методом под названием JButton, при создании передаем параметр текст который будет написан !!на кнопке!!

    private final JTextField input = new JTextField ("", 5);//создаем поле которое не будет подписанно так
    // как мы не ввели данные в ковычки, и размер будет 5 колонок

    private final JLabel label = new JLabel ("Input");//создаем надпись которую к примеру можно будет
    // использовать для формы(поля input )

    private final JRadioButton radio1 = new JRadioButton ("Select this if your man");//JRadioButton применяеться как кругляшка в которой
    private final JRadioButton radio2 = new JRadioButton ("Select that if your woman");//можно выбирать к примеру какой пол мужской или женский

    private final JCheckBox check = new JCheckBox ("Check", false);//JCheckBox это как квадратик для того чтобы ставить галочку
    //выбираем какой текст написать к примеру "Check" и ставим false для того чтобы изначально галочка !!!не была потавленна!!!

    //создаем конструктор который будет вызываться при создании обьекта
    public SimpleGUI () {
        super("simple Example");//вызываем super, для того чтобы сдвинуться к конструктору в основном нашем классе JFrame
        //в конструктор JFrame передаем просто название нашего конмтруктора

        //а теперь работаем с конструктором данного класса SimpleGUI
        this.setBounds(100, 100, 250, 100);//setBounds указывает положение где будет находиться
        // наша форма (Х и У) а также ширина (width) и высота (height)

        //Создаем операцию которая при выполнении которой будет закрывать форму
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame.EXIT_ON_CLOSE если мы закроем нашу форму то она закроеться

        Container сontainer = this.getContentPane();//посути это и есть наш контейнер в котором находиться форма в которой кнопки поля и т. д.
        сontainer.setLayout(new GridLayout(2,3,2,2));//создаем размеры формы

    }


}
