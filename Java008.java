
public class Main {
  public static void main(String[] args) {
String txt = "Hello World";
String txt1 = "Hello";
String txt2 = " World";
System.out.println("The length of the txt string is: " + txt.length());
System.out.println(txt.toUpperCase());   // 
System.out.println(txt.toLowerCase());   // 
System.out.println(txt.indexOf("World")); // Hallar, Cuenta espacios
System.out.println(txt.indexOf("Hello"));
System.out.println(txt + "."); //Concatenar1
System.out.println(txt1.concat(txt2)); //Concatenar2
String x = "10";
int y = 20;
String z = x + y;
System.out.println(z);  // z will be 1020 (a String)
  }
}
