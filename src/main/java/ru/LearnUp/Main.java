package ru.LearnUp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculatorServ = context.getBean(Calculator.class);
        System.out.println(calculatorServ.sum(5, 6));
        System.out.println(calculatorServ.divide(6, 3));
        System.out.println(calculatorServ.subtract(6, 3));
        System.out.println(calculatorServ.multiply(6, 2));

        /*
        SumProcessor sumProcessor = new SumProcessor();
        SubtractProcessor subtractProcessor = new SubtractProcessor();
        MultiplyProcessor multiplyProcessor = new MultiplyProcessor();
        DivideProcessor divideProcessor = new DivideProcessor();

        Calculator calculator = new Calculator(sumProcessor, subtractProcessor, multiplyProcessor, divideProcessor);
        System.out.println(calculator.sum(7, 2));
        */
    }
}
/*
Написать класс Calculator, который использует процессоры для выполнения операций, классы:

SumProcessor
SubtractProcessor
DivideProcessor
MultiplyProcessor
Методы процессора: process(arg1, arg2)

Методы Calculator:

sum(arg1, arg2)
subtract(arg1, arg2)
divide(arg1, arg2)
multiply(arg1, arg2)
Для выполнения методов необходимо вызывать соответствующие процессоры

Все классы должны быть бинами! Тестируем приложение в классе Main через ClassPathXmlApplicationContext
*/