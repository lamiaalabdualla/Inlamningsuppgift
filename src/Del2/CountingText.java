package Del2;
//    När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
//    exklusive raden med ordet stop
public class CountingText {  //En annan klass som räknar raderna och har koll på antalet tecken
    private int lineCount = 0;
    private int charCount = 0;

    public void addLine(String line){
        lineCount++;
        charCount+= line.length();
    }
    //räkna rader
    public int getLineCount(){
        return lineCount;
    }
    //räkna tecken
    public int getCharCount(){
        return charCount;
    }
}