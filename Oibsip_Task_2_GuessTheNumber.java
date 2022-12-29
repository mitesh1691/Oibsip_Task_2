package Oasis;

import java.util.Scanner;
import java.util.Random;


class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rn = new Random();
        this.number = rn.nextInt(101);
    }
    void intro(){

        System.out.println("------------Welcome to Guess The Number Game!!------------");
        System.out.println("------------In this Game, the computer will generate a random number between 1-100 and you have to guess that number.------------ ");
        System.out.println("------------You will have a maximum of 10 guesses to guess the correct number.------------");
        System.out.println("------------Have Fun!!------------");
    }

    void takeUserInput(){
        System.out.println("Enter Your Guess!!");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }



    boolean isCorrectNumber(){
        noOfGuesses++;


        if (inputNumber == number){
            System.out.format("Your guess is Right, the correct number is %d \nYou took a total of %d attempts to guess the correct number", number, noOfGuesses);
            return true;
        }
        else if (inputNumber > number) {
            System.out.println("The number you have guessed is high, please guess a lower number");

        }
        else {
            System.out.println("The number you have guessed is low, please guess a higher number");

        }
        return false;
    }

}



public class Oibsip_Task_2_GuessTheNumber {
    public static void main(String[] args) {
        Game GuessNumber = new Game();
        boolean boll = false;
        GuessNumber.intro();
        while (!boll){
            GuessNumber.takeUserInput();
            boll = GuessNumber.isCorrectNumber();
        }
    }


}
