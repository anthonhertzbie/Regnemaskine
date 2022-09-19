import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a, b, x0, y0, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indsæt nu din a og b for linjens ligning:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("skriv dit x coordinat, tryk enter og derefter, dit x koordinat");
        x0 = sc.nextInt();
        y0 = sc.nextInt();
        double distance = (Math.abs(a*x0-(b+y0)))/(Math.sqrt(1+Math.pow(a, 2)));
        System.out.println(distance);


    }

}
