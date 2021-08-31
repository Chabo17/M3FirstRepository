import java.util.Scanner;
public class GuessMe {
    public static void main(String[] args) {
        int num = 42;
        int scan =0;
        Scanner sc = new Scanner(System.in);

       System.out.println("I've chosen a number. Betcha can't guess it!");
        scan = sc.nextInt();

        if(scan == num){
            System.out.println("Wow, nice guess! That was it!");
        } else if (scan < num){
            System.out.println("Ha, nice try - too low! I chose " + num);
        }else{
            System.out.println("Ha, nice try - too high! I chose " + num);
        }

    }
}
