import java.util.Scanner;
public class TimeBreaker {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int seconds_input, hours, minutes, seconds;
        System.out.print("Enter Value in Seconds: ");
        seconds_input = t.nextInt();
        hours = seconds_input / 3600;
        minutes = seconds_input % 3600 / 60;
        seconds = seconds_input % 60;
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);
        t.close();
    }
}
