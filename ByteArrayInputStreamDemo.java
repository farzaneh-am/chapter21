package chapter21;
import java.io.*;
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tmp="abcdefghijklmnopqrstuvwxyz";
byte b[]=tmp.getBytes();
ByteArrayInputStream input1=new ByteArrayInputStream(b);
ByteArrayInputStream input2=new ByteArrayInputStream(b,0,3);

}

}
