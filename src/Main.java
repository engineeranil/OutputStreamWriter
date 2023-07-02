import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            String str = "I AM LEARNING JAVA";
            FileOutputStream output = new FileOutputStream("test.txt");
            OutputStreamWriter outputReader = new OutputStreamWriter(output);

            outputReader.write(str);
            outputReader.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
