package string_2;

public class String2 {
    public static String repeatFront(String stringForCopy, int countOfRepeats) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < countOfRepeats; i++) {
            result.append(stringForCopy, 0, countOfRepeats - i);
        }
        return result.toString();
    }

    public static boolean xyzMiddle(String stringForVerification) {
        if(stringForVerification.length() < 3)
            return false;

        int start1 = stringForVerification.length() / 2 - 2;
        int start2 = stringForVerification.length() / 2 - 1;

        if(stringForVerification.length() % 2 == 0) {
            return stringForVerification.startsWith("xyz", start1) ||
                    stringForVerification.startsWith("xyz", start2);
        }

        return stringForVerification.startsWith("xyz", start2);
    }

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length()-2; i += 3) {
            result.append(str, i + 1, i + 3).append(str.charAt(i));
        }
        return result.toString();
    }
}
