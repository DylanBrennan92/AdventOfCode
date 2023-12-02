import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Calc {

    public Calc() {
    }

    public ArrayList stripNonDigits(ArrayList<String> fileList){
        ArrayList<String> strippedFileList = new ArrayList<>();
        for(String line : fileList){
            line = line.replaceAll("\\D","");
            strippedFileList.add(line);
        }
        return strippedFileList;
    }
    public int calculateSum(ArrayList<String> strippedFileList){
        int finalSum = 0;
        for(String line : strippedFileList){
                int lineSum;
                char[] charArray = line.toCharArray();
                int n = charArray.length;
                char firstChar = charArray[0];
                char lastChar = charArray[n-1];
                String s = "";
                s=(String.valueOf(firstChar)) + (String.valueOf(lastChar));
                lineSum = Integer.parseInt(s);
                //System.out.println("line is " + line +" s is " + s);
                System.out.println("line is " + line + " lineSum is " + lineSum);
                finalSum+=lineSum;
        }

        return finalSum;
    }
}
