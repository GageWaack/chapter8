package Work.ArrayMethodWork;

public class reverse {
    public static void displayreverse()
    {

        int num = 123456789, reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
