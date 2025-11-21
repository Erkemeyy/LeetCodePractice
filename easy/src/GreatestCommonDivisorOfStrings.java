public class GreatestCommonDivisorOfStrings {
    public static void main (String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        System.out.println(gcd.gcdOfStrings("BACABC", "ABC"));

    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder newStr = new  StringBuilder();
        int x = str1.length();
        int y = str2.length();


        for (int i = 0; i < y; i++) {
            if (x-y > 4 && str1.charAt(i+1) == str1.charAt(1) && i > 0){
                newStr = newStr.replace(0, newStr.length(), "");
                break;
            }
            if (str1.charAt(i) == str1.charAt(0) && i > 0 && x%y!=0) {
                break;
            }
            if (str1.charAt(i) == str2.charAt(i) && str1.charAt(x-1) == str2.charAt(y-1)) {
                newStr.append(str1.charAt(i));
            } else {
                break;
            }
            if (x>y && str1.charAt(y) != str2.charAt(0)) {
                newStr = newStr.replace(0, newStr.length(), "");

                break;
            }
        }
        return newStr.toString();

    }
}
