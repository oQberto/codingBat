package array_2;

public class Array2 {

    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
     * <p>
     * matchUp([1, 2, 3], [2, 3, 10]) → 2
     * matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     */
    public static int matchUp(int[] array1, int[] array2) {
        int numberOfCoincidences = 0;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i] - array2[i]) == 1 ||
                    Math.abs(array1[i] - array2[i]) == 2) {
                numberOfCoincidences++;
            }
        }
        return numberOfCoincidences;
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it contains no 4's.
     * <p>
     * no14([1, 2, 3]) → true
     * no14([1, 2, 3, 4]) → false
     * no14([2, 3, 4]) → true
     */
    public static boolean no14(int[] array) {
        int one = 0, four = 0;
        for (int element : array) {
            if (element == 1) {
                one = 1;
            } else if (element == 4) {
                four = 4;
            }
        }
        return one != 1 || four != 4;
    }

    public static int[] fizzArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

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
