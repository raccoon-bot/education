import java.util.Scanner;

public class UsernameVerification {
    public static void main(String[] args) {
        //обьявляем класс  Scanner, который принимает на вход в программу данные с клавиатуры
        Scanner scan = new Scanner(System.in);
        //написать вывод
        System.out.println("what is your name? \n");
        //Объявить переменную, в которую будет записываться ответ юзера
        String name = scan.nextLine();
        // Написать условие: если имя совпадает с заданным в условии - то выводится один ответ, если не совпадает - то другой ответ
        if (name.equals("Akakiy") || name.equals("Sara") || name.equals("Lida") ) {
            System.out.println(name + ", you have a cool name!");
        }
        else {
             System.out.println( name+ ", your name sucks!");
                }

    }
}
