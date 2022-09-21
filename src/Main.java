

public class Main {
    public static void main(String[] args) {
        task4(); // 4 задание, по исправлению бага в имени.

        int[] arr = generateRandomArray();
        int totalExpenses = 0;
        int minExpenses = arr[0];
        int maxExpenses = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            totalExpenses += arr[i];

            if (minExpenses > arr[i]) {
                minExpenses = arr[i];
            }
            if (maxExpenses < arr[i]) {
                maxExpenses = arr[i];
            }


        }
        double averageExpenses = (double) totalExpenses / arr.length;
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
        System.out.print("Минимальная сумма трат за день составила " + minExpenses + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageExpenses);


    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }


        return arr;
    }


    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int nameLength = reverseFullName.length - 1;
        for (int i = 0; nameLength >= i; nameLength--) {
            System.out.print(reverseFullName[nameLength]);
        }
        System.out.println();
    }




}





