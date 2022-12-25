import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int givenNumber;
        int guessNumber;
        boolean correct = false;
        Scanner guess = new Scanner(System.in);
        System.out.println("Given Number ");
        givenNumber = guess.nextInt();
        while(!correct){
            System.out.println("Guess: ");
            guessNumber= guess.nextInt();
            if (guessNumber == givenNumber){
                System.out.println("Hurray You Guess The Correct Number");
                break;
            } else if (guessNumber< givenNumber) {
                System.out.println("Your Guess is Low");

            } else if (guessNumber>givenNumber) {
                System.out.println("Your Guess is High");

            }

        }
    }
}