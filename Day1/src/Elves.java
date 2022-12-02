import java.io.File;
import java.util.Scanner;

public class Elves {


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
        while (readCalories.hasNextLine()) {
            int calories = 0;
            String next = readCalories.nextLine();
            while (!next.equals("") && readCalories.hasNext()) {
                calories += Integer.parseInt(next);
                next = readCalories.nextLine();
            }
            if (calories > mostCalories) {
                mostCalories = calories;
            }
        }
        return mostCalories;
    }


    public static int partTwo(int mostPreviousCalories) {

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
        while (readCalories.hasNextLine()) {
            int calories = 0;
            String next = readCalories.nextLine();
            while (!next.equals("") && readCalories.hasNext()) {
                calories += Integer.parseInt(next);
                next = readCalories.nextLine();
            }
            if (calories < mostPreviousCalories && calories > mostCalories) {
                mostCalories = calories;
            }
        }
        return mostCalories;
    }
    

    public static void main(String[] args) {
        int firstAmount = partOne();
        System.out.println("Most Calories1 = " + firstAmount);
        int secondAmount = partTwo(firstAmount);
        System.out.println("Most Calories1 = " + secondAmount);
        int thirdAmount = partTwo(secondAmount);
        System.out.println("Most Calories1 = " + thirdAmount);

        int totalAmount = firstAmount + secondAmount + thirdAmount;
        System.out.println("Top 3 total: "+totalAmount);

    }
}


