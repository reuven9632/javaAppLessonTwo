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



        Container container = this.getContentPane();//посути это и есть наш контейнер в котором находиться форма в которой кнопки поля и т. д.
        container.setLayout(new GridLayout(3,2,0,2));//создаем размеры формы строки, колонки, отступы по вертикали и по горизонтали

        container.add(label);//с помощю метода add добавляем в окно (форма) название (label) от  (input), а так же можно добавлять многое другое
        container.add(input);//теперь добавляем (input) и т.д.



        ButtonGroup group = new ButtonGroup ();//для того чтобы при нажатии один из вариантов выделялся а второй
        // переставал быть выделенным используем ButtonGroup
        group.add(radio1);//добавил ввриант выбора  radio1
        group.add(radio2);//добавил ввриант выбора  radio2
        container.add(radio1);//добавил кнопку radio1 container
        radio1.setSelected(true);//для того чтобы она была уже выбранна ставим true в методе setSelected
        container.add(radio2);//добавил кнопку radio2 container
        container.add(check);//добавил квадратик для того чтобы ставить галочку
        button.addActionListener(new ButtonEventListener ());//присваиваю кнопке button метод addActionListener для вызова другого класса в котором
        // будет реализация действия, и записываем в круглые скобки тот самый клас с помощью которого будет реализованно действие
        //ButtonEventListener это вымышленный мной класс(нужно создать и описать действие)
        container.add(button);//добавляю кнопку button в container
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "button was pressed\n";
            message += "the text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "radio1" : "radio2") + " is selected\n";
            message += "SelectBox is" + (check.isSelected() ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "OUTPUT", JOptionPane.PLAIN_MESSAGE);
            //JOptionPane создает новое окно в котором будет выведенно сообщение с помощью .showMessageDialog, а внутри
            // круглых скобок указываем параметры, первый это свои данные, потом что выводим, название, и вид того что будет выведенно(пролстое сообщение)
        }
    }
}
