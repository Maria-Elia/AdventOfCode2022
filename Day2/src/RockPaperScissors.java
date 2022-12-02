import java.io.File;
import java.util.Scanner;

public class RockPaperScissors {

    public static void partOne() {
        File input = new File("puzzleInput.txt");
        Scanner guide;
        try {
            guide = new Scanner(input);

        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        int totalPoints = 0;

        while (guide.hasNextLine()) {
            String opponent = guide.next();
            String me = guide.next();
            totalPoints += outcome(opponent, me);
            totalPoints += shape(me);
        }
        System.out.println("Total points: "+totalPoints);
    }

    public static int outcome(String opponent, String me){
        if((opponent.equals("A") && me.equals("X")) || (opponent.equals("B") && me.equals("Y")) || (opponent.equals("C") && me.equals("Z"))) return 3;
        else if((opponent.equals("A") && me.equals("Y")) || (opponent.equals("B") && me.equals("Z")) || (opponent.equals("C") && me.equals("X"))) return 6;
        else return 0;
    }

    public static int shape(String me){
        if(me.equals("X")) return 1;
        else if(me.equals("Y")) return 2;
        else return 3;
    }

    public static void partTwo(){
        File input = new File("puzzleInput.txt");
        Scanner guide;
        try {
            guide = new Scanner(input);

        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        int totalPoints = 0;

        while (guide.hasNextLine()) {
            String opponent = guide.next();
            String me = guide.next();
            String shape = whichShape(opponent, me);
            totalPoints += outcome(opponent, shape);
            totalPoints += shape(shape);
        }
        System.out.println("Total points: "+totalPoints);
    }

    public static String whichShape(String opponent, String me){

        if(me.equals("X")){
            if(opponent.equals("A")) return "Z";
            else if(opponent.equals("B")) return "X";
            else return "Y";
        } else if(me.equals("Y")){
            if(opponent.equals("A")) return "X";
            else if(opponent.equals("B")) return "Y";
            else return "Z";
        } else{
            if(opponent.equals("A")) return "Y";
            else if(opponent.equals("B")) return "Z";
            else return "X";
        }

    }

    public static void main(String[] args) {
        partOne();
        partTwo();
    }
}


