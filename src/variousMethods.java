/*
Comparing StringBuffer and StringBuilder using various methods
 */
public class variousMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("World");

        //append function
        System.out.println("Append function : ");
        stringBuffer.append("_World_");
        stringBuilder.append("_Hello_");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println();

        //insert function
        System.out.println("Insert function : ");
        stringBuffer.insert(5," java ");
        stringBuilder.insert(5," java ");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println();

        //delete function
        System.out.println("Delete function : ");
        stringBuffer.delete(5,1000);
        stringBuilder.delete(5,1000); //1000 do not cause any error
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
