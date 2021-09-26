package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class ex37 {

      public static void main(String[] Args) {

           Scanner scanner = new Scanner(System.in);
           ArrayList<String> Password = new ArrayList<String>();

           System.out.print("What's the minimum length? ");
           String min_length = scanner.nextLine();

           System.out.print("How many special characters? ");
           String special = scanner.nextLine();

           System.out.print("How many numbers? ");
           String numbers = scanner.nextLine();

           int Length = Integer.parseInt(min_length);
           int Special = Integer.parseInt(special);
           int Numbers = Integer.parseInt(numbers);
           int Letters = Length - (Special + Numbers);

           if (Letters < (Special + Numbers)) {
                System.out.print("The number of letters must be equal to or bigger than the number of special characters and numbers.");
                System.exit(0);
           }

           Array_Generator(Password, Letters, Numbers, Length);
           Collections.shuffle(Password);

           System.out.print("Your password is ");

           for(int i =0 ; i<Length; i++){
                System.out.print(Password.get(i));
           }

      }

      public static void Array_Generator(ArrayList<String> Password, int Letters, int Numbers, int Length){
           Random rand = new Random();

           for (int i = 0; i < Letters; i++) {
                char random_letter = (char) ('a' + rand.nextInt(26));
                String s1 = String.valueOf(random_letter);
                Password.add(s1);
           }

           for (int j = Letters; j < Letters + Numbers; j++) {
                int random_number = rand.nextInt(10);
                String s2 = String.valueOf(random_number);
                Password.add(s2);

           }

           for (int k = Letters + Numbers; k < Length; k++) {
                char random_special = (char) ('!' + rand.nextInt(15));
                String s3 = String.valueOf(random_special);
                Password.add(s3);
           }


      }

}
