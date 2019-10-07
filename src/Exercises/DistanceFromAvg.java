package Exercises;

import java.util.Scanner;

public class DistanceFromAvg {
    public static void main (String[] args)
    {
       double[] arryNums = new double[20];


       int count = 0;
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        double userEntry = 0;
        double total = 0;
        double avg = 0;
        double distance;

        while(quit)
        {
            count++;
            System.out.println("Please enter a number >>>>>>>");
            userEntry = input.nextDouble();
            arryNums[count] = userEntry;
            count++;
            if (count == 20)
            {
                quit = false;
            }
            else if (userEntry == 99999)
                quit = false;
            else
            {
                arryNums[count] = userEntry;
                total = total + userEntry;
                count++;
            }
        }
        avg = total/count;
        for (int i = 0; i < count; i++)
        {
            distance = arryNums[i] - avg;
            System.out.println("The average was "+ avg + " \n First entry was " + arryNums[i]+
            "\n The distance was " +  distance + "\n Total count " + count);
        }

    }
}
