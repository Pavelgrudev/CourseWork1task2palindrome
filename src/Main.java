public class Main {
    public static void main(String[] args) {
        String s = "llццддддццll";

        System.out.println(isPalindrome(s) ? "Это палиндром" : "это не Палиндром");}
    private static boolean isPalindrome(String s) {
      if(s.length() == 1 || s.length() == 0) {
        return true;}
     if(s.charAt(0) == s.charAt(s.length() - 1)) {
         return  isPalindrome(s.substring(1,s.length()-1));}
return  false;
}}


