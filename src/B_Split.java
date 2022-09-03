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

        List<Integer> single = new ArrayList<Integer>(Arrays.asList(4,6));
        int[][] pair = {{1,5},{3,9},{2,8}};
        for (int i = 1; i < flag.length; i++) {
            if(flag[i] == 0 && single.contains(i)) {
                if(i == 4 && flag[7] == 1 && (flag[2] == 1 || flag[8] == 1 || flag[5] == 1 || flag[1] == 1 || flag[3] == 1 || flag[9] == 1 || flag[6] == 1 || flag[10] == 1)) {
                    ans = "Yes";
                    System.out.println(ans);
                    System.exit(0);;
                }
                if(i == 6 && flag[10] == 1 && (flag[3] == 1 || flag[9] == 1 || flag[5] == 1 || flag[1] == 1 || flag[2] == 1 || flag[8] == 1 || flag[4] == 1 || flag[10] == 1)) {
                    ans = "Yes";
                    System.out.println(ans);
                    System.exit(0);;
                }
            }
            if(flag[i] == 0 && !single.contains(i)) {
                for (int j = 0; j < pair.length; j++) {
                    if (flag[pair[j][0]] == 0 && flag[pair[j][1]] == 0) {
                        if(i == 1 || i == 5) {
                            if ((flag[4] == 1 || (flag[2] == 1 ||flag[8] == 1)||flag[7] == 1) || ((flag[3] == 1 ||flag[9] == 1) ||flag[6] == 1 ||flag[10] == 1)) {
                                ans = "Yes";
                                System.out.println(ans);
                                System.exit(0);;
                            }
                        }
                        if(i == 3 || i == 9) {
                            if ((flag[4] == 1 || (flag[2] == 1 ||flag[8] == 1)||flag[7] == 1||(flag[1] ==1 || flag[5] ==1)) || (flag[6] == 1 ||flag[10] == 1)) {
                                ans = "Yes";
                                System.out.println(ans);
                                System.exit(0);;
                            }
                        }
                        if(i == 2 || i == 8) {
                            if ((flag[4] == 1||flag[7] == 1) || ((flag[5] == 1 ||flag[1] == 1) ||(flag[3] == 1 ||flag[9] == 1)|| flag[6]==1 || flag[10]==1)) {
                                ans = "Yes";
                                System.out.println(ans);
                                System.exit(0);;
                            }
                        }
                    }
                }
            }
        }
    
        System.out.println(ans);
    }
}
