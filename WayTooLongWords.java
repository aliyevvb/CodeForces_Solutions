import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfWords=sc.nextInt();
        sc.nextLine();
        String[] word=new String[numberOfWords];
        for(int i=0;i<numberOfWords;i++){
            word[i]=sc.nextLine();
        }
        for(int i=0;i<numberOfWords;i++){
            if(word[i].length()>10){
                System.out.print(word[i].charAt(0));
                System.out.print(word[i].length()-2);
                System.out.print(word[i].charAt(word[i].length()-1));
            }
            else System.out.print(word[i]);
            System.out.println();
        }
        sc.close();
    }
}
