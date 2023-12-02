import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {

    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public FileProcessor(ArrayList<String> list) {
        this.list = list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public FileProcessor() {
    }

    public ArrayList buildArrayListFromFileRead() {
        try {
            Scanner s = new Scanner(new File("src/resources/inputfile.txt"));
            while (s.hasNext()) {
                list.add(s.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file " + e);
        }
        return list;
    }
}

