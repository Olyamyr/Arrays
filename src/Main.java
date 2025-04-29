//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Вывести на консоль числа от 10 до 50, кроме чисел с 34 до 45");

        for(int number = 10; number < 50; ++number) {
            if (number < 34 || number > 45) {
                System.out.println(number);
            }
        }

        System.out.println("\n2. Вывести все номера кабинтов ВУЗа, при условии, что там 6 этажей и на каждом " +
                "по 9 кабинетов. Как только дойдем до 45 кабинета, перестать выводить кабинеты на этом этаже.");

        for(int floor = 1; floor <= 6; ++floor) {
            for(int numberOfCabinet = 1; numberOfCabinet <= 9 && (floor != 4 || numberOfCabinet != 5); ++numberOfCabinet) {
                System.out.println("Кабинет №: " + floor + numberOfCabinet);
            }
        }

        System.out.println("\n3. Создадим пустой массив на 11 элементов");
        int[] intNumbers = new int[11];
        boolean[] booleansValues = new boolean[11];
        System.out.println(intNumbers);
        System.out.println("Длина массива: " + intNumbers.length);

        System.out.println("\n4. Создадим массив чисел и выведем их значение по порядку, а затем в обратном порядке.");
        double[] doubleNumbers = new double[]{1.1, (double)4.5F, 3.54, 7.53, 2.65, 8.53};
        System.out.println("Вывод чисел по порядку расположения в массиве");

        for(int index = 0; index < doubleNumbers.length; ++index) {
            double number = doubleNumbers[index];
            System.out.println(number);
        }

        System.out.println("Вывод чисел по порядку обратному расположения в массиве");

        for(int index = doubleNumbers.length - 1; index >= 0; --index) {
            double number = doubleNumbers[index];
            System.out.println(number);
        }

        System.out.println("Вывести все четные числа из массива");
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int index = 0; index < numbers.length; ++index) {
            int number = numbers[index];
            if (numbers[index] % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("\n5. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14. " +
                "Как только цикл дойдет до 23, остановить вывод и написать в консоль (достигнуто целевое число!).");
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30};

        for(int index = 0; index < num.length; ++index) {
            int number = num[index];
            if (num[index] % 2 == 0 && number != 6 && number != 10 && number != 14) {
                if (number >= 23) {
                    break;
                }
                System.out.println(number);
            }
        }
        System.out.println("достигнуто целевое число!");
    }
}
