import java.util.ArrayList;
import java.util.List;

public class MergeAlternativly {

    public static void main(String[] args) {

        String word1 = "pqr";
        String word2 = "mpr";

        char[] wd1 = word1.toCharArray();
        char[] wd2 = word2.toCharArray();

        int len1 = wd1.length;
        int len2 = wd2.length;
        int total = len1+len2;

        List<Character> temp = new ArrayList<>();

        int i =0;
        int j=0;

        while(i < len1 && j < len2){
           temp.add(wd1[i]);
           temp.add(wd2[j]);

            i++;
            j++;
        }

        while(j<len2){
            temp.add(wd2[j]);
            j++;
        }

        while(i<len1){
            temp.add(wd1[i++]);
        }


        for (char c : temp) {
           System.out.print(c);
        }

    }
}