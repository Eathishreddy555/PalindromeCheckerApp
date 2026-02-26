public class PalindromeCheckerApp {
    public static void main() {
        String word = "radar";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (word.charAt(end) != word.charAt(start)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}