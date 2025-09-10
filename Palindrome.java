public class Palindrome{
    public static void main(String[] args){
        if(args.length ==0){
            System.out.println("Please provide a string to check!");
            return;

        }
        String str =args[0];
        if(isPalindrome(str))
        {
            System.out.println(str + " is a palindrome!");
        }
        else{
            System.out.println(str + " is not a palindrome!");

        }
        }
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

}
