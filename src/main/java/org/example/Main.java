package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            States currentState = States.Q_;
            int summ = 0;
            Mili miliMachine = new Mili();

            while (summ < 250){
                System.out.println("Введите число из предложенных: 50; 100; 200");
                int price = scanner.nextInt();

                // Проверка ввода
                if (price != 50 && price != 100 && price != 200) {
                    System.out.println("Ошибка: допустимы только 50, 100, 200!");
                    continue; // Пропускаем итерацию
                }

                summ += price;
                System.out.println("Ваша сумма составляет: " + summ);


               currentState = miliMachine.transitions(currentState, summ);
            }
            System.out.println("До скорых встреч!");
        }
    }
