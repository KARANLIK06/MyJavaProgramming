package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char [] letters = new char[26];

      /*  for (char i = 'A',j=0; i <= 'Z' &&j<letters.length ; i++ ,j++) {
            letters[j]=i;
        }


       */
        char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]=ch;

        }
        System.out.println(Arrays.toString(letters));               //[A==>Z]



        System.out.println("-------------------------------");

        char character='Z';
        for (int i =0 ; i <letters.length; i++,character--) {
            letters[i]=character;
        }
        System.out.println(Arrays.toString(letters));               //[Z==>A]
    }
}
