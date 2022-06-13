public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = generateRandomArray();
        int sum = 0;
        int min = arr [0];
        int max = arr [0];
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr [i] > max) {
                max = arr[i];
            }
            if (arr [i] <min){
                min = arr [i];
            }

        }
        System.out.println("Сумма трат за месяц составила " + sum+ " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + max+ " рублей");
        System.out.println("Минимальная Сумма трат за месяц составила " + min+ " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + (float) sum/arr.length + " рублей");
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName [i]);

        }





    }
}