import java.io.File;
import java.util.Scanner;

public class Calories {

    /***
     * Prints the highest amount of calories an elf has.
     */
    public static int partOne() {

        File calorieList = new File("calorielist.txt");
        Scanner readCalories;
        try {
            readCalories = new Scanner(calorieList);
        } catch (
                Exception e) {
            System.out.println(e);
            return 0;
        }

        int mostCalories = 0;
        while(readCalories.hasNextLine())
        {
            int calories = 0;
            String next = readCalories.nextLine();
            while(!next.equals("") && readCalories.hasNext()) {
                calories += Integer.parseInt(next);
                next = readCalories.nextLine();
            }
            if(calories > mostCalories){
                mostCalories = calories;
            }
        }
       return mostCalories;
    }

    public static int partTwo(int highestCalories){
        File calorieList = new File("C:\\Users\\Maria\\Documents\\AOC\\Day1\\calorielist.txt");
        Scanner readCalories;
        try {
            readCalories = new Scanner(calorieList);
        } catch (
                Exception e) {
            System.out.println(e);
            return 0;
        }

        int mostCalories = 0;
        while(readCalories.hasNextLine())
        {
            int calories = 0;
            String next = readCalories.nextLine();
            while(!next.equals("") && readCalories.hasNext()) {
                calories += Integer.parseInt(next);
                next = readCalories.nextLine();
            }
            if(calories > mostCalories && calories<highestCalories){
                mostCalories = calories;
            }
        }
        return mostCalories;
    }


    public static void main(String[] args) {
    int caloriesOne = partOne();
    System.out.println("Most calories: "+ caloriesOne);
    int caloriesTwo = partTwo(caloriesOne);
    System.out.println("Most calories 2nd round: "+ caloriesTwo);
    int caloriesThree = partTwo(caloriesTwo);
    System.out.println("Most calories 3rd round: "+ caloriesThree);

    int combinedCalories = caloriesOne + caloriesTwo + caloriesThree;
        System.out.println("Combined calories: "+combinedCalories);
    }
}



