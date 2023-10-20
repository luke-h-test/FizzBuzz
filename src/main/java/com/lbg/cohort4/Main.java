package com.lbg.cohort4;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    int userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to FizzBuzz to? ");
        return parseInt(sc.nextLine());
    }

    void fizzBuzzRun(int userMax)
    {
        int[] fizzBuzzNums = {7, 9};
        HashMap<Integer, String> dict = new HashMap<>();
        dict.put(7, "Fizz");
        dict.put(9, "Buzz");
        dict.put(16, "FizzBuzz");
        for (int i = 1; i < userMax + 1; i++)
        {
            int fizzBuzzChecker = 0;
            for (int vals: fizzBuzzNums)
            {
                if(i % vals == 0)
                {
                    fizzBuzzChecker += vals;
                }
            }

            if(dict.containsKey(fizzBuzzChecker))
            {
                System.out.println(dict.get(fizzBuzzChecker));
            }
            else
            {
                System.out.println(i);
            }


        }
    }
    public static void main(String[] args)
    {
        Main mm = new Main();

        mm.fizzBuzzRun(mm.userInput());

    }
}