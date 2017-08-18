/**
 * Created by natha on 3/10/2017.
 */
import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        int side1, side2, side3;
        Scanner datain = new Scanner(System.in);
        System.out.println("Enter Side 1:");
        side1 = datain.nextInt();
        System.out.println("Enter Side 2:");
        side2 = datain.nextInt();
        System.out.println("Enter Side 3:");
        side3 = datain.nextInt();
        if ((side1 % side2 == 0) && (side1 % side3 == 0)&&(side3%side2==0)) {
            System.out.println("Equaladeral Triangle");
        }
        else if ((side1 % side2 != 0) && (side1 % side3 != 0)) {
        System.out.println("Scalene Triangle");
    }
        else {
            System.out.println("Isoceles Triangle");
    }
    }
}
