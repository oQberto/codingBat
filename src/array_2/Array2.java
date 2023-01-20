package array_2;

public class Array2 {

    public static boolean lucky13(int[] array) {
        boolean isLucky = true;
        for (int element : array) {
            if (element == 1 || element == 3) {
                isLucky = false;
                break;
            }
        }
        return isLucky;
    }

    public static int sum13(int[] array) {
        if (array == null) {
            return 0;
        }
        int sumOfArrayNumbers = 0;

        for (int element : array) {
            if (element == 13) {
                return sumOfArrayNumbers;
            }
            sumOfArrayNumbers += element;
        }
        return sumOfArrayNumbers;
    }

    public static int countEvens(int[] array) {
        int countOfEvenNumbers = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                countOfEvenNumbers++;
            }
        }
        return countOfEvenNumbers;
    }
}
