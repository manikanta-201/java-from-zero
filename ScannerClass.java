import java.util.Scanner;


class ScannerClass{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println("You Entered The String = ");
System.out.println(s);
int x= sc.nextInt();
System.out.println("You Entered The Integer =");
System.out.println(x);
float f = sc.nextFloat();
System.out.println(" You Entered The Float = ");
System.out.println(f);
}
}