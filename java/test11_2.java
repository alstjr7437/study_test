package home1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test11_2 {

	public static void main(String[] args) throws Exception{
		//�ѱ� ������ ���� inputStream, outputStream �̿�
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Home\\Desktop\\����!\\a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		BufferedReader fr = new BufferedReader(inputStreamReader);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Home\\Desktop\\����!\\b.txt");
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter fw = new BufferedWriter(OutputStreamWriter);
		
		int c;

		while((c = fr.read()) != -1) {	
			//�ѳ��� �Ͽ��� �Ҷ����� �����Ҷ� ������ ���⵵�� newLine �߰�
			fw.write(Character.toUpperCase((char)c));
			fw.newLine();
		}
		System.out.println("b������ ��������ϴ�.");
		fr.close();
		fw.close();

	}


}
