import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.print("Enter side x: ");
        x= scanner.nextDouble();
        System.out.print("Enter side y: ");
        y= scanner.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("Your hypoteuse is "+z);



    }
}
