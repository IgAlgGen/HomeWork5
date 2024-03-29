public class Main {


    public static void main(String[] args) {
        //Задание 1
        /*Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или телефона, а также мобильное приложение.
        И нам, и клиенту удобнее с телефона пользоваться мобильным приложением. Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание приложения.
        Но мы не знаем, iOS или Android он использует.
        Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.
        Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        Например, для iOS оно будет звучать так:
        «Установите версию приложения для iOS по ссылке».
        А для Android так:
        «Установите версию приложения для Android по ссылке».*/
        System.out.println("Задание 1");
        int clientOS = 1; //Ось клиента
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

        }
        //Задание 2
        /*К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона, но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
        Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий — операционной системы телефона (iOS или Android) и года производства.
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        Например, для iOS оно будет звучать так:
        «Установите облегченную версию приложения для iOS по ссылке».
        А для Android так:
        «Установите облегченную версию приложения для Android по ссылке».
        При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
        Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).*/
        System.out.println("Задание 2");
        int clientDeviceYear = 2014; //Год изготовления устройства
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //Задание 3
        /*Напишите программу, которая определяет, является ли год високосным или нет.
        Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        « …. год является високосным». или «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.*/
        System.out.println("Задание 3");
        int year = 2004; // Проверяемый год
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");
        /*Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки.
        Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.*/

        int deliveryDistance = 150, deliveryDays = 1, daysDelivery = 1 + (deliveryDistance + 19) / 40; // решение (daysDelivery = 1 + (deliveryDistance + 19) / 40) слизано, но работает более корректно
        System.out.println("Потребуется дней " + daysDelivery);

        if (deliveryDistance > 0) {
            deliveryDays+= (deliveryDistance + 20) / 40;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        //Задание 5
        System.out.println("Задание 5");
        /*Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).*/
        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }
}