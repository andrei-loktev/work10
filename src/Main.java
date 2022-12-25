public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int sumMax = arr[0];
        int sumMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sumMax) {
                sumMax = arr[i];
            }
            if (arr[i] < sumMin) {
                sumMin = arr[i];
            }
        }
        System.out.println("максимальная трата в день " + sumMax);
        System.out.println("минимальная трата в день " + sumMin);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей");
    }
    public static void task4() {
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1;i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}
