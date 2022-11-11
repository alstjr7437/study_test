package home1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test11_2 {

	public static void main(String[] args) throws Exception{
		//한글 설정을 위해 inputStream, outputStream 이용
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Home\\Desktop\\개발!\\a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		BufferedReader fr = new BufferedReader(inputStreamReader);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Home\\Desktop\\개발!\\b.txt");
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter fw = new BufferedWriter(OutputStreamWriter);
		
		int c;

		while((c = fr.read()) != -1) {	
			//한나씩 하여서 할때마다 복사할때 새줄이 생기도록 newLine 추가
			fw.write(Character.toUpperCase((char)c));
			fw.newLine();
		}
		System.out.println("b파일을 만들었습니다.");
		fr.close();
		fw.close();

	}


}
