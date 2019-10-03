
package bufferedreadeexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Monique Sullivan
 */
public class BufferedReadeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File myFile = new File("LoremIpsum.txt");
        
        try {
            
            BufferedReader reader = new BufferedReader (new FileReader(myFile));
            String line;
            
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
