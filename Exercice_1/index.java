import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez l'angle 1 du triangle");

        int angle_1 = sc.nextInt();

        System.out.println("Entrez l'angle 2 du triangle");

        int angle_2 = sc.nextInt();

        System.out.println("Entrez l'angle 3 du triangle");

        int angle_3 = sc.nextInt();

        int sum = angle_1 + angle_2 + angle_3;

        if (sum == 180) {

            System.out.println("It is a valid triangle");

        } else {

            System.out.println("It is not a valid triangle");
        }

    }
}