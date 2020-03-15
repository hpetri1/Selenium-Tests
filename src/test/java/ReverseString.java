// THIS IS NOT A TEST, JUST FOR PRACTICE

public class ReverseString {
    public static void main(String[] args) {

        String myStr = "ABCDEFG";
        String rev = "";

        Integer len = myStr.length();

        while (len >= 1) {
            rev = rev + myStr.charAt(len - 1);
            len --;
        }

        System.out.println(rev);
    }
}
