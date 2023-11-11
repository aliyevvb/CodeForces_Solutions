import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] advancers=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            advancers[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(advancers[i]>=advancers[k-1]&&advancers[i]!=0) count++;
        }
        System.out.println(count);
        scan.close();
    }
}
