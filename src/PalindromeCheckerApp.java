import java.util.LinkedList;

public class PalindromeCheckerApp {
    static void main() {
        String s = "madam";
        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if(first != last) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(s + " is a Palindrome");
        }else{
            System.out.println(s + " is not a Palindrome");
        }
    }
}
