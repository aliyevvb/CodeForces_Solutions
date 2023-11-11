import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitPP {
    public static void main(String[] args) {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        try {
            int numOfProblems=Integer.parseInt(bf.readLine());
            int result=0;
            for(int i=0;i<numOfProblems;i++){
                String line=bf.readLine();
                if(line.charAt(1)=='+') result++;
                else result--;
            }
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Something went wrong: "+e.getMessage());
        }

    }
}
