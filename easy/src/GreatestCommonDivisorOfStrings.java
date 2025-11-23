public class GreatestCommonDivisorOfStrings {
    public static void main (String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        System.out.println(gcd.gcdOfStrings("AB", "ABABAB"));



    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder newStr = new StringBuilder();
        int x = str1.length();
        int y = str2.length();
        int smallNum;
        int largestNum;
        String longestString;



        if (x > y){
            smallNum = y;
            largestNum = x;
            longestString = str1;

        } else{
            smallNum = x;
            largestNum = y;
            longestString = str2;
        }

        if ((str1 + str2).equals(str2 + str1)){
            int gcd = 0;
            int i = smallNum - 1;

            
            if (largestNum % smallNum == 0){
                gcd = smallNum;

            } else {
                while (largestNum % i != 0 || smallNum % i != 0){
                    i--;
                    gcd = i;

                }
            }
            newStr.append(longestString.substring(0, gcd));
        }  else {
            newStr = new StringBuilder("");
        }
        return newStr.toString();


    }
}
