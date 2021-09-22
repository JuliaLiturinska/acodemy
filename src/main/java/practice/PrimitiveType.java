package practice;

public class PrimitiveType {
    public static void main(String[] args) {

        // Double primitive type practice
        //wrapper class

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
        System.out.println(doubleValue);

        // Float primitive type practice

        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.1f;

        // Long Primitive type practice

        // Int primitive type practice

        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int firstVariable = 200;
        int secondVariable = 400;

        System.out.println(Integer.max(firstVariable, secondVariable));
        System.out.println(Integer.compare(400, 200));


        // Method call
        printHelloWorld();

        // String

        String myName = "Julia";
        String lastName = "Liturinska";

        System.out.println(myName + " " + lastName); // metod println perenos na novuju stroku "\n" umeet sam)
        System.out.printf("%s %s\n", myName, lastName); // metod printf ne umeet pereson na novuju stroku avtomatom
        String nameAndUserName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndUserName);

        // Boolean
        boolean isStudent = true; // student li?




    }
        // Method declaration
        public static void printHelloWorld() {
            System.out.println("Hello World");
        }


}



