import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        int n=0;
        boolean boo = true;
        Scanner scan = new Scanner(System.in);
        while(boo){
        System.out.println("Please enter an integer: ");
        String info = scan.nextLine();
        try{
            n = Integer.parseInt(info);
            boo = false;
        }
        catch(NumberFormatException ex){
            System.out.println("I said an int");
        }
    }
        int sum =0;
        int sum2 = 0;

        for(int i =3;i<=n;i+=3){
            sum+=i;
            System.out.println(i);
        }
        for(int i =5; i<=n; i+=5){
            sum2+=i;
            System.out.println(i);
        }
        System.out.println("The sum of all multiples of 3 and 5 to "+n+" is: "+(sum+sum2));

    }
}
