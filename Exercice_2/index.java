import java.util.Scanner;

/**
 * index
 */
public class index {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is the time zone between your home and your destination");

        int horaire = sc.nextInt();

        int resultMidi = ((horaire + 12) > 24) ? ((horaire + 12) - 24) : (horaire + 12);

        int resultMinuit = ((horaire + 24) > 24) ? ((horaire + 24) - 24) : (horaire + 24);

        if ((horaire <= -25) || (horaire >= 25)) {

            System.out.println("L'heure entrez n'est pas sous format 24 heure");

        } else {

            System.out.println(
                    "Lorsqu'il est midi à son domicile, il sera à la destination de son voyage  a :" + resultMidi);
            System.out.println(
                    "Lorsqu'il est minuit à son domicile, il sera à la destination de son voyage  a :" + resultMinuit);

        }

    }
}