import static java.lang.System.out;

public class Application2
{
    public static void main(String[] args) {
        int myInt = 7;

        String text = "Hello";

        String blank = " ";

        String name = "Bob";

        String greeting = text + blank + name;

        out.println(greeting);

        out.println("Hello" + " " + "Bob");

        out.println("My integer is: " + myInt);

        double myDouble = 7.8;

        out.println("My number is: " + myDouble + ".");
    }
}
