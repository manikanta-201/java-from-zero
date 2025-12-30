import java.io.*;


class JavaInput{
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println(" Enter a String");

String s =br.readLine();
System.out.println("You entered \t " +s);

}
}