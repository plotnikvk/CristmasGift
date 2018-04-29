package com.company;

public class Main {

    public static void main(String[] args) {
     Gift[]  gifts = new Gift[5];// Создаем массив объектов типа Подарок

        /**
         * Создаем объекты входящих в подарок сладостей. Передаем параметры для инизиализации
         */
        Candy candy = new Candy("Барбарис", 15, 5, "Прилипает к зубам");
        Candy candy1 = new Candy("Леденец", 25, 7, "Круглый и на палочке");
        Biscuit cake = new Biscuit("Медовик", 500, 150, "Очень сладкий");
        Marshmallow marshmallow = new Marshmallow("Зефир", 50, 30,"Тает во рту" );
        JellyBean jellyBean = new JellyBean("Мармелад", 30, 40, "Тянется как резина" );

        /**
         * Присваиваем ячейкам массива Подарков объекты наших сладостей
         */
     gifts[0] = candy;
     gifts[1] = candy1;
     gifts[2] = cake;
     gifts[3] = marshmallow;
     gifts[4] = jellyBean;

     int totalWeight = 0;
     int totalPrice = 0;
/*
Подсчитываем общий вес, общую стоимость и выводим информацию о подарке
 */
     System.out.println("Подарок содержит:");

     for (int i = 0; i <gifts.length; i++){
     totalWeight += gifts[i].weight;
     totalPrice += gifts[i].price;
     System.out.println(gifts[i].name+" с параметром:\""+gifts[i].uniqueParameter+"\"");
     }
     System.out.println("Общий вес подарка равен:\t\t"+totalWeight+" гр.");
     System.out.println("Общая стоимость подарка равна:\t"+totalPrice+" руб.");



    }
}
