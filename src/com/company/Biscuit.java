package com.company;

/**
 * see @Gift
 * see @Biscuit
 * Производный класс для всех сладостей типа Пирожное, который наследует от базового класса Подарок, в том числе все
 * параметры
 */
public class Biscuit extends Gift {
    public Biscuit(String name, int weight, int price, String parameter){
        super.name =name;
        super.weight = weight;
        super.price = price;
        super.uniqueParameter = parameter;
    }
}
