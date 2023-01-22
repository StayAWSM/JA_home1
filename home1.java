package JA_home1;

import java.math.BigInteger;
import java.util.Scanner;

/*  1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
    2. Вывести все простые числа от 1 до 1000
    3. Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
3
+
4
ответ:
1 + 2

Дополнительно*+ Задано уравнение вида x + y = z. И (x, y, z) >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
Вывод 24 + 45 = 69 */

public class home1 {
    public static void main(String[] args) {
        task1();

    }

    static void task1() {
        System.out.println("Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), " + 
        "n! (произведение чисел от 1 до n)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;
        BigInteger mult = BigInteger.ONE;
        for (int i = 1; i <= num; i++){
            sum += i;
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        System.out.println("n треугольного числа = " + sum);
        System.out.println("n! = " + mult);
    }

    static void task2() {
        System.out.println("Задача 2. Вывести все простые числа от 1 до 1000");
        for (int i = 1; i <= 1000; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }
    }

    static void task3() {
        System.out.println("Задача 3. Реализовать простой калькулятор Scanner");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = sc.nextInt();
        System.out.print("Введите знак действия: ");
        String sign = sc.next();
        System.out.print("Введите второе число: ");
        double num_2 = sc.nextInt();
        double res;
        if (sign.equals("+")){
            System.out.print(num_1 + num_2);
        }
        else if (sign.equals("-")){
            System.out.print(num_1 - num_2);
        }
        else if (sign.equals("*")){
            System.out.print(num_1 * num_2);
        }
        else if (sign.equals("/")){
            System.out.print(num_1 / num_2);
        }
    }
}
