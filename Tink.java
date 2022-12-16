import java.util.ArrayList;
import java.util.Scanner;

public class Tink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer iter = sc.nextInt();
        Integer num;
        ArrayList<Integer> numArray = new ArrayList<>();
        int maxOr = 0;

        for (int k=0;k<iter;k++){
            num = sc.nextInt();
            if (!numArray.contains(num)){
                numArray.add(num);
            }
            for (int i=0; i<numArray.size()-1;i++){
                for(int j = i+1;j<numArray.size();j++){
                    int or = numArray.get(i)^numArray.get(j);
                    if (or > maxOr){
                        maxOr = or;
                    }
                }
            }
            System.out.println(maxOr);
        }
    }
}
