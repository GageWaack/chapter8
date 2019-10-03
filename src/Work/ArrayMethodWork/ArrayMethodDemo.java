package Work.ArrayMethodWork;

public class ArrayMethodDemo
{
    public static void main (String [] args)
    {
        int[] omega = {1,2,3,4,5};
        displayForward(omega);
       displayreverse(omega);
        displaysum(omega);
    }
    public static void displayForward(int[] omega){

        for (int j = 0; j < omega.length; j++ ){
            System.out.println(omega[j]);
        }
    }
    public static void displayreverse(int[] omega)
    {

        for(int i = omega.length-1; i >= 0; --i) {
            System.out.println(omega[i]);
        }
    }
       public static void displaysum(int[] omega)
    {
        for (int total = omega.length; --total)
        {
            total = total + omega;
            System.out.println("Here is the sum " + total);
        }

    }
}
