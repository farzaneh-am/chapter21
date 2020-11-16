package chapter21;
import java.io.*;
public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(ObjectOutputStream objOstrm=
new ObjectOutputStream(new FileOutputStream("serial")))
{
	MyClass object1=new MyClass("Hello",-7,2.7e10);
	System.out.println("object1: " +object1);
	objOstrm.writeObject(object1);
	}catch(IOException e) {
		System.out.println("Exception during Serialization: "+e);
	}
try(ObjectOutputStream objIstrm=
new ObjectOutputStream(new FileOutputStream("serial")))
{
	MyClass object2= new MyClass("Hello",-7,2.7e10);
	System.out.println("object2: " +object2);
	}catch(IOException e) {
		System.out.println("Exception during Serialization: "+e);
	}
	}
	}


