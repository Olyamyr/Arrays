//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, кроме 6, 10, 14. " +
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

        System.out.println("\n2. Создать массив чисел и вывести его диагональ");
        int[][] array = new int[][]{
                {1, 6, 4, 6, 7, 5},
                {43, 36, 654, 1, 23, 44},
                {5, 98, 54, 23, 98, 98},
                {7, 70, 57, 98, 79, 300},
                {12, 20, 92, 55, 87, 123},
                {6, 66, 45, 876, 91, 56}};

        for(int verticalIndex = 0; verticalIndex < array.length; ++verticalIndex) {
            int[] nestedArray = array[verticalIndex];

            for(int horizontalIndex = 0; horizontalIndex < nestedArray.length; ++horizontalIndex) {
                array[verticalIndex][horizontalIndex] = 0;
            }
        }

        System.out.println("Вывести диагональ сверху вниз");

        for(int verticalIndex = 0; verticalIndex < array.length; ++verticalIndex) {
            int[] nestedArray = array[verticalIndex];

            for(int horizontalIndex = 0; horizontalIndex < nestedArray.length; ++horizontalIndex) {
                if (verticalIndex + horizontalIndex == 5) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println("Вывести в шахматном порядке");

        for(int verticalIndex = 0; verticalIndex < array.length; ++verticalIndex) {
            int[] nestedArray = array[verticalIndex];

            for(int horizontalIndex = 0; horizontalIndex < nestedArray.length; ++horizontalIndex) {
                if ((verticalIndex + horizontalIndex) % 2 == 0) {
                    int number = nestedArray[horizontalIndex];
                    System.out.print(number);
                } else {
                    System.out.print(" ");
                }
            }
        }

        System.out.println();
    }
}
