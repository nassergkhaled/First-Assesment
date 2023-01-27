public class Main {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ? true : (year % 100 == 0) ? false : (year % 4 == 0);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(1996));
    }
}