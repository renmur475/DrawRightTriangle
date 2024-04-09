

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("Enter triangle height: ");
        int triangleHeight = input.nextInt();
        System.out.print("Enter character to be used: ");
        String triangleChar = input.next();
        input.close();

        //Loops triangleHeight times and prints the character i times depending on the loop its at
        for(int i = 0; i <= triangleHeight; i++)
        {
            System.out.println(triangleChar.repeat(i)); 
        }
    }
}
