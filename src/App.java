public class App {
    public static void main(String[] args) throws Exception {
        String creator = "Vinh";
        int number1 = 6;
        int number2 = 1;
        int multiplication, addition, division, subtraction;
        // Print name of author
        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);
        // Print value of variable number1 and number2
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        // Print result of function multiplication
        multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        // Print result of function addition
        addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);
        // Print result of function division
        division = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);
        // Print result of function subtraction
        subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
