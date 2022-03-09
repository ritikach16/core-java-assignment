import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun{
    public static void main(String[] args) {
        Scanner inFile;
        try{
            inFile = new Scanner(new File("input.txt"));

            int input;
            int sum = 0;
            while(inFile.hasNext()){
                input = inFile.nextInt();
                System.out.println("Input: "+input);
                sum += input;
            }
            System.out.println("Sum: " + sum);

            inFile.close();
        }catch(FileNotFoundException ex){
            System.out.println("file NOT FOUND!");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("type mismatch!!");
        }
    }
}