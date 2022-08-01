import java.util.Scanner;

public class bilPrima {
    public static void main(String args[] ) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int number = input.nextInt();
        
        for (int s = 0; s <= number; s++) {
            mencariBilanganPrima(s);
        }
    }
    public static void mencariBilanganPrima(int n) {
        int s, flag = 0;
        for (s = 2; s <= n / 2; ++s) {
            if (n % s == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(n+" Bilangan prima");
        } else {
            System.out.println(n+" Bukan bilangan prima");
        }
    }
}