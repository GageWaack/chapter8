package Work.ArrayMethodWork;

public class ArrayMethodDemo
{    public static void main (String [] args)
    {
        int[] omega = {1,2,3,4,5,6,7,8,9,10};
        displayForward(omega);
       displayreverse(omega);
        displaysum(omega);
    }
    public static void displayForward(int[] omega){

        for (int j = 0; j < omega.length; j++ ){
            System.out.println("Numbers given are "+ omega[j]);
        }
    }
    public static void displayreverse(int[] omega)
    {

        for(int i = omega.length-1; i >= 0; --i) {
            System.out.println("Numbers backwards is "+ omega[i]);
        }
    }
       public static void displaysum(int[] omega)
    {
        int sum = 0;
        for (int value : omega)
        {
        sum += value;
        System.out.println("The sum is "+ sum);
        }
    }
}
