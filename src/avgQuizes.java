import java.util.Scanner;

public class avgQuizes {
    public static void main (String[] args)
    {
        int[] scoresArray = new int[10];
        int score;
        int total = 0;
        int high = 0;
        int low = 100;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= scoresArray.length; i++)
        {
            System.out.println("Enter quiz score number " + i + ">>>>>");
            score = input.nextInt();
            scoresArray[i] = score;
            total = scoresArray[i] + total;

        }
        System.out.println("The scores entered were");

        System.out.println("The average is "+ total/scoresArray.length);
        System.out.println("The high is "+ high + " The low is " + low);
    }
}
