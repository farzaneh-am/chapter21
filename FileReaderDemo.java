package chapter21;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try (FileReader fr=new FileReader("FileReaderDemo.java"))
{
	int c;
	while((c=fr.read())!=-1)System.out.print((char)c);
	
}catch(IOException e) {
	System.out.println("I/O Error: "+e);
}
	}

}
