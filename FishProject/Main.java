package FishProject;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner you = new Scanner(System.in);
        System.out.println("How many fish in the fishtank? Max 1000.");
        String fishNum = you.nextLine();
        FishTank myTank = new FishTank(fishNum);
    }

}