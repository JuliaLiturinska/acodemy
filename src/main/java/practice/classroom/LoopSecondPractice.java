package practice.classroom;

import java.sql.SQLOutput;

public class LoopSecondPractice {

    public static void main(String[] args) {
        /*
        //condition - true/false
        while(condition) {
        // code block
        counter update
        }
         */

      /*  int i = 0;
        while (i <= 10) {
            System.out.println("Hello World");
            i++;


        }
        boolean isStudent = false;

        while (!isStudent) {
            System.out.println("Is not the student");
            isStudent = true;

        }

        String[] animals = {"Cat", "Dog", "Elephant", "Panda", "Monkey"};
        boolean isFound = false;

        while (!isFound) {
            for (String animal : animals) {
                if (animal.equals("Panda")) {
                    System.out.println("Found Panda!");
                    isFound = true;
                }
                int x = 5;
                while (x >= 0) {
                    System.out.println(x);
                    x--;
                }

                for (int y = 5; y >= 0; y--) {
                    System.out.println(y);
*/
                    // --y umenjshaet "i" na 1 a zatem daet znachenie 4
                    // y-- daet znachenie 5 i potom toljko umenjshaet na 1

                    int[] nums = {30, 10, 20, 10, 40}; //110
                    int i = 0;
                    int sum = 0;
                    while (i < nums.length) {
                        sum = sum + nums[i];
                        i = i + 1;

                    }
                    System.out.println("Sum of the numbers:" + sum);
     /*
     do {
     // do something
     } while (condition)
      */

        int counter = 20;
        do {
            System.out.println("Current number is:" + counter);
            counter--;
        } while (counter > 0 );

        }
                }

