package chapter21;
import java.io.*;
public class CharArrayReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tmp1="abcdefghijklmnopqrstuvwxyz";
int length=tmp1.length();
char c[]=new char[length];
tmp1.getChars(0, length, c, 0);
int i;
try(CharArrayReader input1=new CharArrayReader(c))
{
	System.out.println("input1 is: ");
	while((i=input1.read())!=-1) {
		System.out.print((char)i);
	}
	System.out.println();

	}catch(IOException e) {
		System.out.println("I/O Error: "+e);
		
	}
try(CharArrayReader input2=new CharArrayReader(c,0,5))
{
	System.out.println("input2 is:");
	while((i=input2.read())!=-1) {
		System.out.print((char)i);
	}
	System.out.println();

	}catch(IOException e) {
		System.out.println("I/O Error: "+e);
		
	}
	}
}


