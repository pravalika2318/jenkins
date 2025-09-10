public class Palindrome{
    public static void main(String[] args){
        if(args.length ==0){
            System.out.println("Please provide a string to check!");
            return;

        }
        string str =args[0];
        if(is Palindrome(str))
        {
            System.out.println(word +"is a palindrome!");
        }
        else{
            System.out.println(word + "is not a palindrome!");

        }
        }
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

}
