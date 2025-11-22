package Del2;
import java.util.Scanner;
public class ReadingText {     //En klass som läser in text och skriver ut resultatet till användaren

    public static void main(String[] args) {
    //    Skriv ett program som läser in text ifrån kommandoraden rad för
    //    rad tills användaren skriver ordet stop.
        Scanner input = new Scanner(System.in);

        CountingText counter = new CountingText();

        while (true){
            String myInput = input.nextLine();

//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
            if (myInput.equals("stop")) {
                break;
            }
            counter.addLine(myInput);
        }
        //När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
        //exklusive raden med ordet stop
            System.out.println(" Antal tecken:" + counter.getCharCount());
            System.out.println(" Antal rader:" + counter.getLineCount());
    }
}


