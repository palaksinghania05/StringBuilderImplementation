/*
Create an application to accept the input from user and represent it in following format :
input : hello
output : _ _ _ _ _
 */
import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            System.out.print("_ ");
        }
    }
}
