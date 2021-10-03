package practice.classroom;

public class LoopPractice {
    public static void main(String[] args) {


        /*
        for(statement1; statement2; statement3) {
        // code block to be executed
       }

       statement 1 - is executed (one time) of the code block
       //initialize counter variable: (int i = 0);

       statement 2 - define the condition for executing the code block
       // Boolean condition
       // Element list = 10;
       // i < 10;

       // statement 3 - is executed (every time) after the code block has been executed
       // Increment/Decrement counter variable
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");

        }
        // i = 0;
        // 0 < 10 (TRUE)
        // CODE IS EXECUTED

        // i = 2;
        // 2 < 10 (TRUE)
        // CODE IS EXECUTED

        // i = 10;
        // 10 < 10 (FALSE)
        // ABORT

        String[] names = {"Nikita", "Andrew", "Max", "Anthony"};

     //   for(int i = 0; i < names.length; i++) {
       //     System.out.println(names[i]);

        // i = 0;
        // 0 < 4;
        // System.out.println(names[0]);

        // i = 1;
        // 0 < 4;
        // System.out.println(names[1]);

  /*      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 4) {
                System.out.println(numbers[i]);


            } else {
                System.out.println("Other numbers: " + numbers[i]);

            }
        }
*/
        for (int i = 0; i < names.length; i++) {
           if(names[i].equals("Andrew")) {
               System.out.printf("I found Andrew");
           }
        }
        // name [0] = Nikita
        //  Nikita == Andrew (False)

        // name [1] = Andrew
        //  Andrew == Andrew (True)
        }
    }

