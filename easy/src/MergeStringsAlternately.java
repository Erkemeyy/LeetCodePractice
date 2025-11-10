import java.util.Arrays;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String a = "123";
        String b = "abcefg";



        String newString = b.replace("", "-");
        if (a.length() <= b.length()) {
            for (int i = 0; i < a.length(); i++) {

                newString = newString.replaceFirst("-", String.valueOf(a.charAt(i)));

            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (b.length() - i >=0){
                    newString = newString.replaceFirst("-", String.valueOf(a.charAt(i)));
                }else{
                    newString += String.valueOf(a.charAt(i));
                }}
        }




        System.out.println(newString.replace("-", ""));
    }
}
