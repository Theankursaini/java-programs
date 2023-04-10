import java.util.Arrays;
import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        System.out.println("enter array size");
        try (Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            int a[]= new int [size];
            int sum=0;
            System.out.println("enter elements one by one");
            for(int i=0;i<size;i++)
            {
                a[i]=s.nextInt();
                sum=a[i]+sum;
            }
      
                System.out.println("sum of elements ::"+sum);
        }
        
        
    }
}