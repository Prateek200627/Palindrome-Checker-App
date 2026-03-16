public class Uc2 {
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Variable to store result
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display output
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?");
        System.out.println(isPalindrome);
    }

}
