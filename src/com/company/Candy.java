package com.company;

/**
 * see @Gift
 * see @Candy
 * Производный класс для всех конфет типа Леденец, который наследует от базового класса Подарок, в том числе все
 * параметры
 */
public class Candy extends Gift {
public Candy(String name, int weight, int price, String parameter){
    super.name =name;
    super.weight = weight;
    super.price = price;
    super.uniqueParameter = parameter;
}

}
