// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//            1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//            2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//            3. если вместо массива пришел null, метод вернет -3
//            4. если элемент есть - вернуть его.
//    Напишите метод, в котором реализуйте взаимодействие с пользователем.
//    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//    обработает возвращенное значение и покажет читаемый результат пользователю.
//    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
package Praktika;

public class Main {
    public static void main(String[] args) {
        int[] massiv = new int[7];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i +2;
        }
        //System.out.println(f1(massiv));
        printF2(massiv, 234);
    }
    public static int f1(int[] massiv){
        if (massiv.length < 5){
            return -1;
        }
        return massiv.length;
    }
    public static int f2(int[] massiv, int value){
        if (massiv == null){
            return -3;
        }
        if (massiv.length < 5){
            return -1;
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == value){
                return  i;
            }
        }
        return -2;

    }

    public static void printF2(int[] massiv,int value){
        int code = f2(massiv, value);
        if (code == -1){
            System.out.println("Длинна массива меньше 5 " + code);
            return;
        }
        if (code == -2){
            System.out.println("Элемент не найден " + code);
            return;
        }
        if (code == -3){
            System.out.println("Маааив = null " + code);
            return;
        }
        System.out.println("Индекс нашего числа" + " " + code);
    }
}