import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int matrix[][]=new int[5][5];
        int row=0,column=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=scan.nextInt();
                if(matrix[i][j]==1){
                    row=i+1;
                    column=j+1;
                }
            }
        }
        double count=Math.abs(row-3)+Math.abs(column-3);
        System.out.println((int)count);
        scan.close();
    }
}
