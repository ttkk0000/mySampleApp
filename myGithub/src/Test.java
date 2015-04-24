import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("test");
        do {
            String line = "test";
            try {
                line = reader.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(line.equals("quit")) break;
            System.out.println(line);
        } while (true);
    }

}


