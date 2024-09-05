public class App {
    public static void main(String[] args) throws Exception {
        String creator = "Vinh";
        int number1 = 6;
        int number2 = 1;
        int multiplication, addition, division, subtraction;

        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);

        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);

        division = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

        subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
