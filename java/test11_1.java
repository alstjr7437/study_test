package home1;

import java.io.FileReader;
import java.io.FileWriter;

public class test11_1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Home\\Desktop\\����!\\a.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Home\\Desktop\\����!\\b.txt");
		
		int c;

		while((c = fr.read()) != -1) {	
			fw.write(Character.toUpperCase((char)c) + "\n");
		}
		System.out.println("b������ ��������ϴ�!");
		fr.close();
		fw.close();

	}

}
