import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main() {
        String word = "noon";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        Stack<Character> stack = new Stack<> ();
        for(char c: word.toCharArray()) {
            stack.push(c);
        }
        for(int i=0;i<word.length();i++){
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}