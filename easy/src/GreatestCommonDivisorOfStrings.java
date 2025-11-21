public class GreatestCommonDivisorOfStrings {
    public static void main (String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        System.out.println(gcd.gcdOfStrings("ABABABAB", "AB"));
        StringBuilder test = new StringBuilder("a");
        System.out.println(test.toString() == "a");

    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder newStr = new StringBuilder();
        int x = str1.length();
        int y = str2.length();
        int smallNum =0;
        int largestNum = 0;



        if (x > y){
            smallNum = y;
            largestNum = x;
        } else{
            smallNum = x;
            largestNum = y;
        }

        if (largestNum % smallNum ==0 ){
            String newStr1 = "";

            while(!newStr.toString().equals(str1)){
                int i =0;
                if(str1.charAt(0) == str2.charAt(0)){
                    newStr.append(str1.charAt(0));
                    str1.replace(String.valueOf(str2.charAt(0)), "");
                }



            }



        } else {
            newStr = new StringBuilder("");
        }

        return newStr.toString();



    }
}
