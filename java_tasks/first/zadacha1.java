//Дана длина ребра куба. Найти объём куба и площадь его боковой поверхности.
// Цырен Батуев, АПК - 25
import java.util.Scanner;// подключение библиотеки. java.utils - из нее нам только Scanner нужен

//Главный класс, должен называться так же, как и файл
public class zadacha1{
    // главная функция, точка входа, должна называться main
    public static void main(String[] args){

        cubeMethods.testSquare(); // тесты функций вычисления квадрата и куба
        cubeMethods.testVolume();

        System.out.print("Введите длину ребра куба: ");    // Все в джаве объект. Вызываем сначала класс, потом поле, потом метод. Этот чисто выводит текст в двойный кавычках.
        double n; // длина ребра
        Scanner sc = new Scanner(System.in); // создаем объект. new Scanner(System.in) - конструктор с параметром System.in подробностей не знаю

        n = sc.nextFloat(); //считывание с клавиатуры типа флоут
        double squareCube = cubeMethods.square(n); // иницилизация переменной, площадь куба(простой квадрат числа...)
        double volumeCube = cubeMethods.volume(n); // объем куба
        System.out.printf("Площадь грани куба равен: %.3f, Объём куба равен: %.3f", squareCube, volumeCube); // все как в С
    }
}
