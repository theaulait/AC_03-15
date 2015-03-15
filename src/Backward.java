/**
 * Created by c4q-vanice on 3/15/15.
 */
public class Backward {
    /*public static void main(String[] args){ // my work done on own
        String hello = "Hello, world!";
        hello.length();
        char rev;
        for(int i = 12; i >= 0; i--) {

       }
    */

    public static void printReverse(String text)// example 1. Poor execution of the requested program.

    {
        System.out.print(text.charAt(12));
        System.out.print(text.charAt(11));
        System.out.print(text.charAt(10));
        System.out.print(text.charAt(9));
        System.out.print(text.charAt(8));
        System.out.print(text.charAt(7));
        System.out.print(text.charAt(6));
        System.out.print(text.charAt(5));
        System.out.print(text.charAt(4));
        System.out.print(text.charAt(3));
        System.out.print(text.charAt(2));
        System.out.print(text.charAt(1));
        System.out.print(text.charAt(0));
    }





    public static void printReverse2(String input) {   //example 2. of a good code
        int letters = input.length();
        for (int i = letters - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    public static String reverse(String input){
        int letters = input.length();
        String result = "";
        for (int i = letters -1;i >=0; i--){
            result += input.charAt(i);
        }

        return result;
    }
    public static void main(String[] args)
    {
        reverse("Today is Sunday");
    }
}

