package practice.classroom;

public class Methods {
    public static void main(String[] args) {

      int y = 1;
      int x = 2;
       // int result = y + x;
        //System.out.println("Your result: " + result);


        int result = returnSum(y, x);
        System.out.println("Your result: " + result);

    }

    // void - returns nothing
    // public static int sum(int first Number, ins second Number)
    // return value;

    // method parameters


    public static void sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("pur result: " + result);
    }
    public static int returnSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

}


}
