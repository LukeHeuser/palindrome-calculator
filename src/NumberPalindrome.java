public class NumberPalindrome {

    public static void main(String[] args) {

        isPalindrome(456521);
        isPalindrome(11);
        isPalindrome(-252);
        isPalindrome(98589);
        isPalindrome(-1265789524);
        isPalindrome(-13231);
        isPalindrome(598654842);
        isPalindrome(-98655689);
        isPalindrome(-98655689);
        isPalindrome(Integer.MAX_VALUE);
        isPalindrome(Integer.MIN_VALUE);

    }
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int original = number;
        while (original != 0) {

            int lastDigit = original % 10;
            reverse = (reverse * 10) + lastDigit;

            original /= 10;
        }

        if (number == reverse) {
            System.out.println(number + " is a palindrome");
            return true;
        }
        else {
            System.out.println(number + " is not a palindrome");
            return false;
        }

    }

}
