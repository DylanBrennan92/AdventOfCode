import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int finalSum;
        ArrayList<String> fileList = new ArrayList<>();
        ArrayList<String> strippedFileList = new ArrayList<>();
        FileProcessor f = new FileProcessor();
        fileList = f.buildArrayListFromFileRead();
//        for(String item : fileList){
//            System.out.println(item);
//        }

        Calc c = new Calc();
        strippedFileList = c.stripNonDigits(fileList);

        for(String item : strippedFileList){
            System.out.println(item);
        }

        finalSum = c.calculateSum(strippedFileList);

        System.out.println("Final Sum is " + finalSum);



    }
}