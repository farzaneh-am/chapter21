package chapter21;
import java.io.*;

class DirListOnly {
public static void main(String[] args) {
		// TODO Auto-generated method stub
String dirname2="/java";
File f2=new File(dirname2);
FilenameFilter only=new OnlyExt("html");
String s[]=f2.list(only);

for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
	}
  }
}
 class OnlyExt implements FilenameFilter {
	String ext;
	
public OnlyExt(String ext) {
	this.ext="."+ext;
	
	}
public boolean accept(File dir , String name) {
	return name.endsWith(ext);
}
}
