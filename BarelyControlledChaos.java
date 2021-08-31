import java.util.Random;

public class BarelyControlledChaos {
    
   
    public static void main(String[] args) {

        String color = Rcolor(); // call color method here
        String animal = Ranimal(); // call animal method again here
        String colorAgain = Rcolor(); // call color method again here
        int weight = Rnum(5,200); // call number method,
            // with a range between 5 - 200
        int distance = Rnum(10,20); // call number method,
            // with a range between 10 - 20
        int number = Rnum(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = Rnum(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    public static String Rcolor(){
        String [] colors = {"red", "yellow", "blue", "orange", "purple"};
        Random R = new Random();
        return colors[R.nextInt(5)];
    }

    public static String Ranimal(){
        String [] animals = {"Lion", "Tigers", "Bears", "Llama", "Monkey"};
        Random R = new Random();
        return animals[R.nextInt(5)];
    }

    public static int Rnum(int x, int y){
        Random R = new Random();
        return R.nextInt(y-x) +x;
    }
    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}