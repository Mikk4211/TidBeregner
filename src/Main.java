import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       // Vi definerer minutter og sekunder som integer, da det er hele tal vi bruger.
        int minutterRes;
        int sekunderRes;


        // Scanner hvor sekunder kan indtastes
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds here");

        int antalSekunder = input.nextInt();


        // Selve beregningen
        minutterRes = antalSekunder/60;
        sekunderRes = antalSekunder%60;                         // Her bruges mod (%), som giver resten af tallet. Her ville vi kunne få ms.

        // Her skrives resultatet af udregningen
        System.out.println("Minutter: " + minutterRes + " Sekunder: " + sekunderRes);


    }
}
