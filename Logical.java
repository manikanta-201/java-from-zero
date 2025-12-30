import java.util.Scanner;
class Logical{
public static void main(String[] args){
String usr="geek",pwd="GEEK";
Scanner sc=new Scanner(System.in);
String iu=sc.next();
String ip=sc.next();
if(usr.equals(iu) && pwd.equals(ip)){
System.out.println("wellcome to java");
}else{
System.out.println("Try agine");
}
}
}