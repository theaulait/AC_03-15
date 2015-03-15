/**
 * Created by c4q-vanice and Luke Lee on 3/15/15.
 */
import java.util.Scanner;

public class Reverse {

    public static String repeat(char input, int length) { //example 1. of asking to repeat a character.
        String answer = "";

        for (int i = 1; i <= length; i++) {
            answer += input;
        }
        return answer;
    }
    public static String repeat2(String input, int length){
        String answer = "";
        for (int i = 0;i<length; i++) {
            answer += input.charAt(i%input.length());
        }
        return answer;
    }
    public static void printInBox(String text){
        System.out.println("+" + repeat('-', text.length()+2)+'+');
        System.out.println("|  " + text + "|");
        System.out.println("+" + repeat('-', text.length()+2)+ "+");
    }
    public static void underline(String input, char symb){
        System.out.println(input);
        System.out.println(repeat(symb, input.length()));
    }

    /*public static String pad(String text,int length, char padchar){ //my example
    String answer = "";
        while(text.length()<length){
            text += padchar;
        }
        return text;
    }
    */
    public static String pad(String text,int length, char padchar){ //Java allows you to have 2 of the same name (overloading) as long as it has different values.
      return text+ repeat(padchar, length - text.length());
    }

    public static String pad(String text,int length, char padchar, boolean left) {
        String padding = repeat(padchar, length - text.length());
        if (left)
            return padding + text;
        else
            return text + padding;
    }
    public static void main(String[] args){
        System.out.println(repeat2("Batman",15));

    }
}
