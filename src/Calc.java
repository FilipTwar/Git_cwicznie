import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wprowaź pierwszą liczbę");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("wprowadź drugą liczbę");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("jakie działanie chcesz wykonać");
        String znak = sc.nextLine();

        if (znak.equals("+")){
            int suma = a+b;
            System.out.println(suma);
        }
        else if (znak.equals("-")){
            int roznica = a-b;
            System.out.println(roznica);
        }
    }
}
