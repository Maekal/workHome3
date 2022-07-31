public class Main {
    public static void main(String[] args) {

        //заданае 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("OC не найдена");
        }


        //Задание 2
        int clientos = 0;
        int year = 2015;
        if (clientos == 0 && year > 2019) {
            System.out.println("Установите обычную версию Android");
        } else if (clientos == 0 && year < 2019) {
            System.out.println("Установите облегченную версию Android  оп ссылке ");
        } else if (clientos == 1 && clientos > 2019) {
            System.out.println("Установите обычнуую версию IOS");
        } else if (clientos == 1 && clientos < 2019) {
            System.out.println("становите облегченную версию IOS  оп ссылке ");
        }

        //Задание 3
        int yaar = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год % високосный");
        } else {
            System.out.println("Год % не високосный");
            //Задание 4
            int deliveryDistance = 95;
            int days = 0;
            if (deliveryDistance > 0 && deliveryDistance < 20) {
                System.out.println("Доставка за 1 день");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Доставка за 2 дня");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Доставка 3 дня");
            }

            //задание 4
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зимний период");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весений период");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний период");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осенний период");
                default:
                    System.out.println("Такого месяца небывает");}
            }
        }
    }



