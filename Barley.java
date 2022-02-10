//////////////////////
//
//Maria Kobilaski
//2/10/2022
//Chien Barley-J2020
//
//////////////////////
/*
Task:

If Barley’s happiness score is 10 or greater then he is happy. Otherwise, he is sad. Determine
whether Barley is happy or sad at the end of the day

His happiness score can be measured using the following formula:
1 × S + 2 × M + 3 × L

*/

import java.util.Scanner;
public class Barley{
    public static void main(String [] args) {
        Scanner cat = new Scanner (System.in);
        int small;
        int med;
        int big;
        int happy;

        small = cat.nextInt();
        med = cat.nextInt();
        big = cat.nextInt();

        happy = 1*small + 2*med + 3*big;

        
        if (happy>=10){
            System.out.println("happy");
        }
        else{
            System.out.println("sad");
        }
        
        cat.close();       
    }
}
