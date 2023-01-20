package array_2;

public class Array2 {

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
