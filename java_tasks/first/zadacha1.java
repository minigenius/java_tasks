
//        Задание: Дана длина ребра куба. Найти объём куба и площадь его боковой поверхности.
//          Автор: Цырен Батуев, АПК - 25

import java.util.Scanner;// подключение библиотеки. java.utils - из нее нам только Scanner нужен
//Главный класс, должен называться так же, как и файл
public class zadacha1{
    // главная функция, точка входа, должна называться main
    public static void main(String[] args){

        cubeMethods.testSquare(); // тесты функций вычисления квадрата и куба
        cubeMethods.testVolume();

        if (args.length > 0) { // если переданы хоть какие-то аргументы

            if(args[0].equals("--help") || args[0].equals("help")) { System.out.println("Программа считает объем куба и площадь боковой поверхности"); System.exit(0); }
            // java сранивает значения напрямую только в примитивах, в остальных случаях ссылки на объект
        try {
        double squareCube = cubeMethods.square(Double.parseDouble(args[0])); // Double.parseDouble(string) - конвертирует строку в Double
        double cube = cubeMethods.volume( Double.parseDouble(args[0]));

        System.out.printf("Площадь грани куба равен: %.3f, Объём куба равен: %.3f %n", squareCube, cube); // все как в С
        System.exit(0); //завершение приложения
        } catch( NumberFormatException e) {

            System.out.println("Ошибка: " + args[0] + " не число" );
            System.exit(1);
        }
        return;
        }

        System.out.print("Введите длину ребра куба: ");    // Все в джаве объект. Вызываем сначала класс, потом поле, потом метод. Этот чисто выводит текст в двойный кавычках.
        double n; // длина ребра
        Scanner sc = new Scanner(System.in); // создаем объект. new Scanner(System.in) - конструктор с параметром System.in подробностей не знаю

        n = sc.nextDouble(); //считывание с клавиатуры типа флоут
        double squareCube = cubeMethods.square(n); // иницилизация переменной, площадь куба(простой квадрат числа...)
        double volumeCube = cubeMethods.volume(n); // объем куба
        sc.close();
        System.out.printf("Площадь грани куба равен: %.3f, Объём куба равен: %.3f %n", squareCube, volumeCube); // все как в С
    }
}
