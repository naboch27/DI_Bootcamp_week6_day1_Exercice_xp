import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    /**
     * @param args
     * @return 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       

     String  [] mot_1 = { "A", "E"," I","O"," U", "L","N","R", "S","T" }; 

     int mot_1Value = 1;

     String  [] mot_2 =  {"D", "G"} ;

     int mot_2Value = 2;
        
     String  [] mot_3 =  {"B","C","M", "P"} ;

     int mot_3Value = 3;

     String  [] mot_4 =  {"F","H","V"," W"," Y"} ;

     int mot_4Value = 4;

     String [] mot_5 =  {"K"} ;

     int mot_5Value = 5;
 
     String [] mot_6 =  {"J"," X"} ;

     int mot_6Value = 8;

     String [] mot_7 =  {"Q"," Z"} ;

     int mot_7Value = 10;

     Mots mots = new Mots () ;

     System.out.println("Entrez votre mots ");

     String motUser = sc.nextLine();

     mots.setMot(motUser);
     
     System.out.println("Entrez votre mots "+mots.getMot()+motUser);
      

     Scrabble scrabble = new Scrabble();

    // scrabble.getScores(motUser)
               
    }



    
}
