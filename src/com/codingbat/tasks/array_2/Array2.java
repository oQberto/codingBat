package com.codingbat.tasks.array_2;

import java.util.Arrays;

public class Array2 {

    /**
     *
     *Given a number n, create and return a new string array of length n, containing the strings
     *"0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
     * <p>
     *fizzArray2(4) → ["0", "1", "2", "3"]
     *fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
     *fizzArray2(2) → ["0", "1"]
     * @param arrayLength
     * @return
     */
    public static String[] fizzArray2(int arrayLength) {
        String[] newStringsArray = new String[arrayLength];

        for (int i = 0; i < newStringsArray.length; i++) {
            newStringsArray[i] = String.valueOf(i);
        }
        return newStringsArray;
    }

    /**
     *
     *Given an array of ints, return true if the number of 1's is greater than the number of 4's
     * <p>
     *more14([1, 4, 1]) → true
     *more14([1, 4, 1, 4]) → false
     *more14([1, 1]) → true
     * @param array
     * @return
     */
    public static boolean more14(int[] array) {
        boolean moreOnesThanFours = false;
        int countOnes = 0;
        int countFours = 0;

        for (int element : array) {
            if (element == 1) {
                countOnes++;
            } else if (element == 4) {
                countFours++;
            }
        }
        moreOnesThanFours = countOnes > countFours;
        return moreOnesThanFours;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     * <p>
     * has22([1, 2, 2]) → true
     * has22([1, 2, 1, 2]) → false
     * has22([2, 1, 2]) → false
     * @param array
     * @return
     */
    public static boolean has22(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
     * except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest
     * value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
     * You may assume that the array is length 3 or more.
     * <p>
     * centeredAverage([1, 2, 3, 4, 100]) → 3
     * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
     * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     * @param array
     * @return
     */
    public static int centeredAverage(int[] array) {
        int centeretAverage = 0;
        int amountOfArrayElements = 0;

        Arrays.sort(array);
        for (int i = 1; i <= array.length - 2; i++) {
            amountOfArrayElements += array[i];
        }
        centeretAverage = amountOfArrayElements / (array.length - 2);
        return centeretAverage;
    }

    /**
     *
     *Return a version of the given array where each zero value in the array is replaced by the
     *largest odd value to the right of the zero in the array. If there is no odd value to the
     *right of the zero, leave the zero as a zero.
     * <p>
     *zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
     *zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     *zeroMax([0, 1, 0]) → [1, 1, 0]
     * @param array
     * @return
     */
    public static int[] zeroMax(int[] array) {
        int maxOdd = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j <= array.length - 1; j++) {
                    if (array[j] % 2 != 0 && array[j] > maxOdd) {
                        maxOdd = array[j];
                    }
                }
                array[i] = maxOdd;
                maxOdd = 0;
            }
        }
        return array;
    }

    /**
     *
     *We'll say that an element in an array is "alone" if there are values before and after it, and those values
     * are different from it. Return a version of the given array where every instance of the given value which is
     * alone is replaced by whichever value to its left or right is larger.
     * <p>
     *notAlone([1, 2, 3], 2) → [1, 3, 3]
     *notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
     *notAlone([3, 4], 3) → [3, 4]
     * @param array
     * @param arrayElementForVerify
     * @return
     */
    public static int[] notAlone(int[] array, int arrayElementForVerify) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == arrayElementForVerify) {
                if (arrayElementForVerify != array[i - 1] &&
                        arrayElementForVerify != array[i + 1]) {
                    array[i] = Math.max(array[i - 1], array[i + 1]);
                }
            }
        }
        return array;
    }

    /**
     *
     *For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
     *until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     * <p>
     *tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
     *tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
     *tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     * @param array
     * @return
     */
    public static int[] tenRun(int[] array) {
        int multipliOfTen;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 10 == 0) {
                multipliOfTen = array[i];
                if (array[i + 1] % 10 != 0) {
                    array[i + 1] = multipliOfTen;
                }
            }
        }
        return array;
    }

    /**
     * Return true if the array contains, somewhere, three increasing adjacent numbers
     * like .... 4, 5, 6, ... or 23, 24, 25.
     * <p>
     * tripleUp([1, 4, 5, 6, 2]) → true
     * tripleUp([1, 2, 3]) → true
     * tripleUp([1, 2, 4]) → false
     * @param array
     * @return
     */
    public static boolean tripleUp(int[] array) {
        boolean isTriple = false;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] &&
                    array[i] + 2 == array[i + 2]) {
                isTriple = true;
            }
        }
        return isTriple;
    }

    /**
     *Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
     * <p>
     *haveThree([3, 1, 3, 1, 3]) → true
     *haveThree([3, 1, 3, 3]) → false
     *haveThree([3, 4, 3, 3, 4]) → false
     * @param array
     * @return
     */
    public static boolean haveThree(int[] array) {
        int countThrees = 0;
        boolean a = false;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 3) {
                a = false;
            }
            if (array[i] == 3 && a == true) {
                return false;
            }
            if (array[i] == 3 && a == false) {
                a = true;
                countThrees++;
            }
        }
        return countThrees == 3;
    }

    /**
     * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
     * separated by one element, such as with {7, 1, 7}.
     * <p>
     * has77([1, 7, 7]) → true
     * has77([1, 7, 1, 7]) → true
     * has77([1, 7, 1, 1, 7]) → false
     *
     * @param array
     * @return
     */
    public static boolean has77(int[] array) {
        boolean is77 = false;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 7 && (array[i + 1] == 7 || array[i + 2] == 7)) {
                is77 = true;
            } else if (array[i + 1] == 7 && array[i + 2] == 7) {
                is77 = true;
            }
        }
        return is77;
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
     * at least one of the pair is that value. Return true if the given value is everywhere in the array.
     * <p>
     * isEverywhere([1, 2, 1, 3], 1) → true
     * isEverywhere([1, 2, 1, 3], 2) → false
     * isEverywhere([1, 2, 1, 3, 4], 1) → false
     *
     * @param array
     * @param deciredValue
     * @return
     */
    public static boolean isEverywhere(int[] array, int deciredValue) {
        boolean isEverywhere = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] == deciredValue || array[i + 1] == deciredValue)) {
                isEverywhere = false;
            }
        }
        return isEverywhere;
    }

    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     * <p>
     * only14([1, 4, 1, 4]) → true
     * only14([1, 4, 2, 4]) → false
     * only14([1, 1]) → true
     *
     * @param array
     * @return
     */
    public static boolean only14(int[] array) {
        boolean isOnly14 = true;
        for (int element : array) {
            if (!(element == 1 || element == 4)) {
                isOnly14 = false;
            }
        }
        return isOnly14;
    }

    /**
     * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
     * <p>
     * sum28([2, 3, 2, 2, 4, 2]) → true
     * sum28([2, 3, 2, 2, 4, 2, 2]) → false
     * sum28([1, 2, 3, 4]) → false
     *
     * @param array
     * @return
     */
    public static boolean sum28(int[] array) {
        int sumOfAll2 = 0;
        for (int element : array) {
            if (element == 2) {
                sumOfAll2 += element;
            }
        }
        return sumOfAll2 == 8;
    }

    /**
     * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending
     * to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
     * <p>
     * sum67([1, 2, 2]) → 5
     * sum67([1, 2, 2, 6, 99, 99, 7]) → 5
     * sum67([1, 1, 6, 7, 2]) → 4
     *
     * @param array
     * @return
     */
    public static int sum67(int[] array) {
        int sumOfArrayElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                while (array[i] != 7) {
                    i++;
                }
                sumOfArrayElements -= array[i];
            }
            sumOfArrayElements += array[i];
        }
        return sumOfArrayElements;
    }

    /**
     * Given an array length 1 or more of ints, return the difference between the largest and smallest
     * values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the
     * smaller or larger of two values.
     * <p>
     * bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     *
     * @param array
     * @return
     */
    public static int bigDif(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
        }
        return max - min;
    }

    /**
     * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
     * problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and
     * running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
     * Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz"
     * instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
     * <p>
     * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
     * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
     * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
     *
     * @param start
     * @param end
     * @return
     */
    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        int firstArrayElement = start;

        for (int i = 0; i < result.length; i++) {
            if (firstArrayElement % 3 == 0 && firstArrayElement % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (firstArrayElement % 3 == 0) {
                result[i] = "Fizz";
            } else if (firstArrayElement % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(firstArrayElement);
            }
            firstArrayElement++;
        }
        return result;
    }

    /**
     * Return a version of the given array where all the 10's have been removed. The remaining elements should shift
     * left towards the start of the array as needed, and the empty spaces an end of the array should be 0.
     * So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
     * <p>
     * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
     * withoutTen([10, 2, 10]) → [2, 0, 0]
     * withoutTen([1, 99, 10]) → [1, 99, 0]
     *
     * @param array
     * @return
     */
    public static int[] withoutTen(int[] array) {
        int[] arrayWithoutTens = new int[array.length];
        int count = 0;

        for (int j : array) {
            if (j != 10) {
                arrayWithoutTens[count++] = j;
            }
        }
        return arrayWithoutTens;
    }

    /**
     * Given a non-empty array of ints, return a new array containing the elements from the original array
     * that come after the last 4 in the original array. The original array will contain at least one 4.
     * <p>
     * post4([2, 4, 1, 2]) → [1, 2]
     * post4([4, 1, 4, 2]) → [2]
     * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     *
     * @param array
     * @return
     */
    public static int[] post4(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int[] newArray = new int[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                newArray = new int[array.length - i - 1];
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = array[i + j + 1];
                }
                break;
            }
        }
        return newArray;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * <p>
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
     * shiftLeft([1, 2]) → [2, 1]
     * shiftLeft([1]) → [1]
     *
     * @param array
     * @return
     */
    public static int[] shiftLeft(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int firstArrayElement = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = firstArrayElement;
        }
        return array;
    }

    /**
     * Return true if the group of N numbers at the start and end of the array are the same. For example,
     * with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
     * You may assume that n is in the range 0..nums.length inclusive.
     * <p>
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
     *
     * @param array
     * @param countOfComparedNumbers
     * @return
     */
    public static boolean sameEnds(int[] array, int countOfComparedNumbers) {
        boolean isSame = true;
        int arrayStartElementCounter = 0;

        for (int i = countOfComparedNumbers; i > 0; i--) {
            isSame = array[arrayStartElementCounter] == array[array.length - i];
            arrayStartElementCounter++;
        }
        return isSame;
    }

    /**
     * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
     * <p>
     * modThree([2, 1, 3, 5]) → true
     * modThree([2, 1, 2, 5]) → false
     * modThree([2, 4, 2, 5]) → true
     *
     * @param array
     * @return
     */
    public static boolean modThree(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                return true;
            } else if (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding
     * element in nums2 (at the same index). Return the count of the number of times that the two elements differ
     * by 2 or less, but are not equal.
     * <p>
     * matchUp([1, 2, 3], [2, 3, 10]) → 2
     * matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     *
     * @param array1
     * @param array2
     * @return
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
     *
     * @param array
     * @return
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
