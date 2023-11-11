import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numberOfProblems=scan.nextInt();
        int decision[][]=new int[numberOfProblems][3];
        int countOfSolutions=0;
        for(int i=0;i<numberOfProblems;i++){
            for(int j=0;j<3;j++){
                decision[i][j]=scan.nextInt();
            }
            if ((decision[i][0] == 1 && decision[i][1] == 1 && decision[i][2] == 0) ||
            (decision[i][0] == 1 && decision[i][1] == 0 && decision[i][2] == 1) ||
            (decision[i][0] == 0 && decision[i][1] == 1 && decision[i][2] == 1)||
            (decision[i][0] == 1 && decision[i][1] == 1 && decision[i][2] == 1)) {
            countOfSolutions++;
        }
    }
    System.out.println(countOfSolutions);
    scan.close();
}}

