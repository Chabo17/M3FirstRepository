import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args){
        String userName;
        int currentYear = 2021;
        int userBirthYear;
        int userAge = 0;
        Scanner inRead = new Scanner(System.in);
        //get user name and birth year
        System.out.println("Hello, let's play a game. What is your name?");
        userName = inRead.nextLine();
        System.out.println();
        System.out.println("Ok " +userName+ ", when were you born?");
        userBirthYear = Integer.parseInt(inRead.nextLine());
        System.out.println();
        //calculate user age
        userAge = currentYear - userBirthYear;
        System.out.println("Well " +userName+ "...");
        if(userBirthYear <= 2005){
            System.out.println("Pixar's 'Up' came out over a decade ago");
        }
        if(userBirthYear <= 1995){
            System.out.println("The first Harry Potter came out over 15 years ago");
        }
        if(userBirthYear <= 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if(userBirthYear <= 1975){
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if(userBirthYear <= 1965){
            System.out.println("the MASH TV series has been around for almost half a century!");
        }
    }
}