package org.example;

public class Mili {
    // currentState - текущее состояние автомата.
    // input - пользовательское число.
    public States transitions(States currentState, int input) {
        switch (currentState) {
            case Q_:
                if (input < 250) {
                    System.out.println("Не хватает еще: " + (250 - input));
                    System.out.println("Действие: не выдавать ничего");
                    return  States.Q_;
                }
            case Q0:
                if (input == 250) {
                    System.out.println("Ваш товар без сдачи!");
                    System.out.println("Действие: выдать товар без сдачи.");
                    return States.Q0;
                }
            case Q1:
                if (input > 250) {
                    System.out.println("Возьмите ваш товар и сдачу!");
                    System.out.println("Действие: товар и выдать сдачу: " + (input - 250));
                    return States.Q1;
                }
        }
        throw new IllegalArgumentException("Не верный символ: " + input);
    }
}

