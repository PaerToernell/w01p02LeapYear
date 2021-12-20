import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Test for leapyear, pls enter a year");
        int aYear= sc.nextInt();
        if(aYear%100 == 0){
            System.out.println("LeapYear");
        } else {
            System.out.println("Not a LeapYear.");
        }
    }
}