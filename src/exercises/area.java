package exercises;
import java.util.Scanner;
public class area {
    public static void main(String[] args){
        double length;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length");
        length = input.nextDouble();
//        input.close();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the width");
        width = input2.nextDouble();
        input2.close();

        double area = length * width;
        System.out.println("Area of the rectangle" + area);


    }
}
