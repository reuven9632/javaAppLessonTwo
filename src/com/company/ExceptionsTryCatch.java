package com.company;
//реализация try/catch может как и многие другие реализовываться в отдельном классе а затем вызвать их через создание переменной
// этого клаасса и вызов соответствующего метода или записать в Main так:
  /*
  public class Main {
    int array[] = new int[]{23, 55, 43};
    int n = 3;


    try {
    System.out.println("array #" + n + array[n]);
    }
    catch (ArithmeticException e) {
    System.out.println("Error" + e);
    }
    catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Error:: ---> ___> ---> " + e);
    }
  }*/

public class ExceptionsTryCatch {   //создал класс ExceptionsTryCatch для реализации метода  try/catch
    int[] array = new int[]{23, 55, 43};
    //в дальнейшем в методе try/catch буду использовать заранее неверное действие  -  вывод
    // несуществующей переменной и затем в catch буду ее овить и указывать действие при ее обнаружении
    int n = 3;

    public void testTryCach () {
        //try тут пишу код который хочу проверить на наличие ошибок
        try {
            System.out.println("array #" + n + array[n]);
        }
        //catch (ArithmeticException e) тут передаю вид ошибки которая может произойти в ходе выполнения
        // кода и {указываю действие при нахождении этой ошибки}


        //кол-во catch неограниченно, можно искать разные ошибки
        //Если не знаю название ошибки то можно запустить код и при опредеоении определенного вида ошибки в RUN будет указанно
        //названиеи строка кода, таким образом можно скопировать это название и передать как параметр в круглых скобках "кетча"
        catch (ArithmeticException e) {
            System.out.println("Error" + e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:: ---> ___> ---> " + e);
        }
    }
}
