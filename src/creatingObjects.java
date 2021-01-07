/*
Create StringBuffer from StringBuilder (or existing StringBuffer) , and
manipulating them.
 */
public class creatingObjects {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("World");
        StringBuffer stringBuffer1 = new StringBuffer(stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder(stringBuffer);
        System.out.println(stringBuffer1);
        System.out.println(stringBuilder1);
        //manipulating new objects
        stringBuffer1.append("_hello world_");
        stringBuilder1.append("_hello world_");
        //print new values
        System.out.println(stringBuffer1);
        System.out.println(stringBuilder1);
        //checking if changes ar reflected or not
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
