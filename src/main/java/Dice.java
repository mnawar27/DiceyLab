import java.util.Random;

public class Dice {

    int digit;

    public Dice(int y){
        this.digit = y;
    }

    public Dice(){
    }

    public int toss() {
        Random random = new Random();
        int number = random.nextInt(6);
        System.out.println("You rolled a " + number);
        return number;
    }

    public static void main (String [] args){
        Dice dice = new Dice();

        System.out.println(dice.toss());
    }


}
