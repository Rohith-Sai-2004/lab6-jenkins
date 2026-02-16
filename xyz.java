import java.util.Scanner;
public class xyz {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in); 
        int a,b;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        System.out.println("Enter a number");
        if(sc.hasNextInt()){
            b = sc.nextInt();
        }
        System.out.println("Sum: "+(a+b));
    }
}   
