import java.util.Scanner;

public class A_Saturday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();
        scanner.close();

        String[] days = new String[5];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        
        int ans = 0;

        for (int i = 0; i < days.length; i++) {
            if(day.equals(days[i])) {
                ans = 5-i;
                break;
            }
        }

        System.out.println(ans);
    }
}
