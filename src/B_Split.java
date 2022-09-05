import java.util.*;

public class B_Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        scanner.close();
        String ans = "No";

        int flag[] = new int[11];
        for (int i = 1; i < flag.length; i++) {
            flag[i] = Character.getNumericValue(S.charAt(i-1));
            if (flag[1] == 1) {
                System.out.println(ans);
                System.exit(0);;
            }
        }

        int count = 0;
        char line[] = new char[7];
        line[0] = '×';
        
        line[1] = flag[7] == 1 ? '○' : '×';
        line[2] = (flag[4] == 1) ? '○' : '×';
        line[3] = (flag[2] == 1 || flag[8] == 1) ? '○' : '×';
        line[4] = (flag[1] == 1 || flag[5] == 1) ? '○' : '×';
        line[5] = (flag[3] == 1 || flag[9] == 1) ? '○' : '×';
        line[6] = (flag[10] == 1) ? '○' : '×';

        for (int i = 0; i < line.length-1; i++) {
            if(line[i] == '×' && line[i+1] == '○') {
                count++;
            }
        }

        if(count > 1) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}
