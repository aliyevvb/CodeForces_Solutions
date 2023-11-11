import java.util.Scanner;
public class DominoPilling{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int width=scan.nextInt();
        int areaOfTable=length*width;
        int areaOfDomino=2*1;
        System.out.println(areaOfTable/areaOfDomino);
        scan.close();
    }
}