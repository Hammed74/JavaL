package JavaL;

public class Main {
    public static void main(String[] args) {
        String myString = "What's-Up-Dude";
        String[] myArray = myString.split("");

        String printedWords = "";
        for(int i = 0; i < (myString.length() * 2); i++){
            if(i > myString.length() - 1){
                printedWords = printedWords.substring(0,printedWords.length() - 1);
                System.out.println(printedWords);
            }else {
                printedWords += myArray[i];
                System.out.println(printedWords);
            }
        }

    }
}