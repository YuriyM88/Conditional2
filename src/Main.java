//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        char clientOs = '1';
        if (clientOs == '0')
            System.out.println("Установите версию приложения для iOS по ссылке ");
        if (clientOs == '1') {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }

        System.out.println("Задача 2");
        int clientOs2 = 1;
        int clientDeviceYear = 2015;
        if (clientOs2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке ");
            }
        }
            else if (clientOs2 == 1) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке ");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке ");
                }
            }

        System.out.println("Задача 3");

    }
}