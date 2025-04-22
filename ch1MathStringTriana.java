package day01;

public class ch1MathStringTriana {
    public static void main(String[] args ) {
        //Reverse
        //int hasilReversed = Reverse(42);
        //int hasilReversed = Reverse(413);
        //int hasilReversed = Reverse(4563);
        //System.out.print(hasilReversed);

        //IsPalindrome
        //ch1MathStringTriana checker = new ch1MathStringTriana();
        //int test1 = 121;
        //System.out.println(test1 + " is palindrome? " + checker.IsPalindrome(test1));
        //int test2 = 2147447412;
        //System.out.println(test2 + " is palindrome? " + checker.IsPalindrome(test2));
        //int test3 = 110;
        //System.out.println(test3 + " is palindrome? " + checker.IsPalindrome(test3));

        //Capitalize
        //System.out.println(Capitalize("this is a very special tittle"));
        //System.out.println(Capitalize("effective java is great"));

        //IsNoDuplicateChar
        //System.out.println(IsNoDuplicateChar("codeid"));
        //System.out.println(IsNoDuplicateChar("abcde"));
        //System.out.println(IsNoDuplicateChar("jdbc"));

        //IsBrace
        //System.out.println(isBrace("(())"));
        //System.out.println(isBrace("()()"));
        //System.out.println(isBrace("((()"));


    }
    public static int Reverse(int n) {

        int reversed= 0;
        while (n > 0){
            int digit = n % 10;                  //ambil digit terakhir
            reversed = reversed * 10 + digit;   // tambahkan ke hasil reversed
            n /= 10;                            //membuang digit terakhir
        }
        return reversed;
    }
    public boolean IsPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
    public static String Capitalize(String input) {
        if (input == " " || input == "" || input == null){
            return "";
        }
        input = input.trim();
        StringBuilder result = new StringBuilder();

        String[] perKata = input.split(" ");
        for (String kata : perKata){
            result.append(Character.toTitleCase(kata.charAt(0)));
            result.append(kata.substring(1));
            result.append(" ");
        }
        return result.toString();
    }
    public static boolean IsNoDuplicateChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBrace(String s) {
        int tertutup = 0;

        for (int i = 0; i < s.length(); i++) {
            char brace = s.charAt(i);

            if (brace == '(') {
                tertutup++;
            } else if (brace == ')') {
                tertutup--;
                if (tertutup < 0) {
                    return false;
                }
            }
        }
        return tertutup==0;
    }



}
