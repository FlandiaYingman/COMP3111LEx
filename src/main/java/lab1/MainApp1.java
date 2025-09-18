package lab1;

public class MainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println(b + " to power " + n + " = " + MyLibrary.power(b, n));
        System.out.println(n + "! = " + MyLibrary.factorial(n));
        System.out.println("Program ..Ended ...");
    }
}
