package com.company;

/**
 * see @Gift
 * see @JellyBean
 * Производный класс для всех сладостей типа Мармелад, который наследует от базового класса Подарок, в том числе все
 * параметры
 */
public class JellyBean extends Gift {
public JellyBean(String name, int weight, int price, String parameter){
    super.name =name;
    super.weight = weight;
    super.price = price;
    super.uniqueParameter = parameter;
}
}
