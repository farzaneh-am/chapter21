package chapter21;
import java.io.*;
public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a &copy; copyright symbol "+
		"but this is &copy not.\n";
		byte buf[]=s.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(buf);
		int c;
		boolean marked=false;
		try (BufferedInputStream f5=new BufferedInputStream(in))
		{
			while ((c=f5.read())!=-1)
				switch(c) {
				case '&':
					if(!marked) {
						f5.mark(32);
						marked=true;
					}
					else {
						marked=false;
					}
				break;
				case ';':
					if(marked) {
						marked=false;
						System.out.print("(c)");
					}
					else
						System.out.print((char)c);
					break;
				case ' ':
					if(marked) {
						marked=false;
						f5.reset();
						System.out.print("&");
					}
					else
						System.out.print((char)c);
					break;
					default:
						if(!marked) {
							System.out.print((char)c);
							break;
				}
		}
		
	}catch(IOException e) {
		System.out.println("I/O Error : "+e);
	}
}
}
