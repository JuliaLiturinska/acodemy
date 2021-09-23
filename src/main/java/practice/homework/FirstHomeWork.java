package practice.homework;
// 1. Create 5 variables for each primitive data type and print it
// 2. Print information about me using String data type variables.
// 3. Try to use String.format() method;



public class FirstHomeWork {
    public static void main(String[] args) {
        double workingHoursMinValue = Double.valueOf(4);
        System.out.println(workingHoursMinValue);

        double workingHoursMaxValue = Double.valueOf(8);
        System.out.println(workingHoursMaxValue);

        int minSalary = Integer.valueOf(1500);
        System.out.println(minSalary);

        int maxSalary = Integer.valueOf(2000);
        System.out.println(maxSalary);

       /* public static int compare(int x, int y)
        Parameter :
        x : the first int to compare
        y : the second int to compare
        Return :
        This method returns the value zero if (x==y),
        if (x < y) then it returns a value less than zero
        and if (x > y) then it returns a value greater than zero.
*/

        int compareSalary = Integer.compare(minSalary, maxSalary);
        System.out.println(compareSalary);

        int compareSalary1 = Integer.compare(maxSalary, minSalary);
        System.out.println(compareSalary1);


        boolean isStudentOfAcodemy = true;
        boolean isStudentOfTSIUniversity = false;

        System.out.println(isStudentOfAcodemy);
        System.out.println(isStudentOfTSIUniversity);



// 2. String data
        String firstName = "Julia";
        String lastName = "Liturinska";
        String yearsOld = "33";
        String liveTown = "Riga";
        String bornCountry = "Belorussia";

        System.out.println("My name is " + firstName + " " + lastName + ". I`m " + yearsOld + ". I live in " + liveTown
        + ", but I was born in " +bornCountry + ".");

        // 3. String.format() method;

        String myStory = String.format("My name is %s %s. I`m %s. I live in %s, but I was born in %s.\n",
                firstName, lastName, yearsOld, liveTown, bornCountry);
        System.out.println(myStory);


    }

}


