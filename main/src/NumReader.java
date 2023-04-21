import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumReader {


    static int [] array = new int[10];


    public static void insertNumbers() throws FileNotFoundException, InvalidNumberException {
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        int index = 0;
        try {
            while(scanner.hasNext()){
                int number = Integer.parseInt(scanner.next());
                if( number < 0){
                    throw new InvalidNumberException("number is less than zero");
                }
                array[index] = number;
                index++;

            }
        }catch ( NumberFormatException e){
          throw new NumberFormatException();
        }

        scanner.close();
    }

    public static void showArray (){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(NumReader.array[i]+" ");
       }
        System.out.println();
    }


    public static void Sum (){
        int sum = 0;
        try {
            for ( int number: array ){
                sum += number;
                if (sum<0){
                    throw new ArithmeticException();
                }

            }
            System.out.println(sum);
        }catch ( ArithmeticException e){
            System.out.println("integer overflow");
        }



    }

}
