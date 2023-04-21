import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        try {
            NumReader.insertNumbers();
            NumReader.showArray();
            NumReader.Sum();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());;
        }




    }
}