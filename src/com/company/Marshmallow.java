package com.company;

/**
 * see @Gift
 * see @Marshmallow
 * Производный класс для всех сладостей типа Зефир, который наследует от базового класса Подарок, в том числе все
 * параметры
 */

public class Marshmallow extends Gift {
 public Marshmallow(String name, int weight, int price, String parameter){
     super.name =name;
     super.weight = weight;
     super.price = price;
     super.uniqueParameter = parameter;
 }
}
