package chapter21;
import java.io.*;
public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Console con;
con=System.console();
if(con==null)return;
str=con.readLine("Enter a string: ");
con.printf("Here is your string: %s\n", str);

	}

}
