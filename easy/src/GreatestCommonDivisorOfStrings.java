public class GreatestCommonDivisorOfStrings {
    public static void main (String[] args) {
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        System.out.println(gcd.gcdOfStrings("ABCABC", "ABC"));

    }
    public String gcdOfStrings(String str1, String str2) {
        String shortest = "";
        StringBuilder newStr = new  StringBuilder();
        if(str1.length()>str2.length()){
            shortest = str2;
        }
        else{
            shortest = str1;
        }
        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) == shortest.charAt(0) && i > 0){
                break;
            }

            if (shortest.charAt(i) == str2.charAt(i)) {

                newStr.append(shortest.charAt(i));
            }




        }
        String string1 = newStr.toString();
        return string1;

    }
}
