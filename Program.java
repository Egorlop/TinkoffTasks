import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String str = sc.nextLine();
        String colors = sc.nextLine();

        ArrayList<Integer> listOfIndexes = new ArrayList<Integer>();
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch: colors.toCharArray()) {
            chars.add(ch);
        }

        int counter = 0;
        listOfIndexes.add(counter);
        for (char ch: str.toCharArray()){
            if (Character.isWhitespace(ch)) {
                chars.add(counter,ch);
            }
            counter+=1;
        }
        StringBuilder colorsString = new StringBuilder(chars.size());
        for(Character ch: chars)
        {
            colorsString.append(ch);
        }
        int badWords = 0;
        String[] splitedColors = colorsString.toString().split(" ");
        for(String str1:splitedColors){
            for (int i=0; i<str1.length()-1;i++){
                if(str1.toCharArray()[i] == str1.toCharArray()[i+1]){
                    badWords+=1;
                    break;
                }
            }

        }
        System.out.println(badWords);

    }
}
