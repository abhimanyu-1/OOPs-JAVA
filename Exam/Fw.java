import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fw {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("art.txt");
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            int data;
            while ((data = reader.read()) != -1) 
            {
                if (data % 2 == 0) 
                {
                    evenWriter.write(data);
                } 
                else 
                {
                    oddWriter.write(data);
                }
            }

            reader.close();
            evenWriter.close();
            oddWriter.close();
            
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
