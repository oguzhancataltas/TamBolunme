import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k, i = 1,j = 0, total = 0;

        System.out.print("Bir tam sayı giriniz : ");
        k = input.nextInt();

        while (i <= k) {

            if ( i % 12 == 0 ){
                System.out.println(i);
                total += i;
                ++j;
            }
            i++;
        }
        System.out.println("Ortalama : " + (total / j));

    }
}
