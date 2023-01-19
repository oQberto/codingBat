package string_2;
public class String2 {

    public static String mixString(String firstStr, String secondStr) {
        if (firstStr.equals("")) {
            return secondStr;
        } else if (secondStr.equals("")){
            return firstStr;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstStr.length();) {
            result.append(firstStr.charAt(i)).append(secondStr.charAt(i));
            i++;
            if (i == firstStr.length() ) {
                result.append(secondStr.substring(i));
                break;
            } else if (i == secondStr.length() ) {
                result.append(firstStr.substring(i));
                break;
            }
        }
        return result.toString();
    }

    public static boolean xyzThere(String stringToFind) {
        boolean isXYZ = false;
        for (int i = 0; i < stringToFind.length();) {
            if (stringToFind.startsWith("xyz", i)) {
                isXYZ = true;
                i += 3;
            } else if (stringToFind.startsWith(".xyz", i)) {
                isXYZ = false;
                i += 4;
            } else {
                i++;
            }
        }
        return isXYZ;
    }

    public static boolean catDog(String stringToVerify) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < stringToVerify.length(); i++) {
            if (stringToVerify.startsWith("cat", i)) {
                catCount++;
            } else if (stringToVerify.startsWith("dog", i)) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

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

    public static String plusOut(String stringToReplace, String unchangedPartOfString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringToReplace.length(); i++) {
            if (i < stringToReplace.length() - unchangedPartOfString.length() + 1 && stringToReplace.startsWith(unchangedPartOfString, i)) {
                result.append(unchangedPartOfString);
                i += unchangedPartOfString.length() - 1;
            } else {
                result.append("+");
            }
        }
        return result.toString();
    }
}
