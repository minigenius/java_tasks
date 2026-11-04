public class cubeMethods{
    // принимает вещ число, возвращает квадрат
    public static double square(double n){
           return n * n;
    }


    // принимает вещ число, возвращает куб
    public static double volume(double n){
            return n * n * n;
    }
    // тесты вычислений квадрата
    public static void testSquare(){
        assert(Math.abs(square(3.0) - 9.0) < 0.00001); // assert() - если внутри скобок ложное логическое выражение, аварийно ложит программу
        assert(Math.abs(square(11.0) - 121.0) < 0.00001);
        assert(Math.abs(square(7.0) - 49.0) < 0.00001);
    }
    // тесты вычисления куба
    public static void testVolume(){
        assert(Math.abs(volume(3.0) - 27.0) < 0.00001);
        assert(Math.abs(volume(4.0) - 64.0) < 0.00001);
        assert(Math.abs(volume(5.0) - 125.0) < 0.00001);
    }
}
