package Collection;
import java.io.*;
public class ReadFile {
    public static void main(String[] args)throws IOException{

        FileReader reader = new FileReader("./aa_file.txt");
        char c = (char) reader.read();
        System.out.println(c);

        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }


    }
}
