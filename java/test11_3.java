package home1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test11_3 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new FileReader("C:\\Users\\Home\\Desktop\\����!\\score.txt"));
		FileWriter fw = new FileWriter("C:\\Users\\Home\\Desktop\\����!\\scoreb.txt");
		int count = 0;
		double sum = 0, max = 0, min = 0;
		String maxName = "", minName="";
		
		while(sc.hasNext()) {
			String name = sc.next();
			Double score = Double.parseDouble(sc.next());
			if(score > max) {
				max = score; 
				maxName = name;
			}
			if(score < min) {
				min = score; 
				minName = name;
			}
			sum += score;
			count++;
		}
		
		fw.write("�� " + count + "�� \n");
		fw.write("���:" + sum / count + "\n");
		fw.write("�ְ�����:" + maxName + max + "\n");
		fw.write("��������:" + minName + min + "\n");
		fw.close();
		System.out.println("scoreb������ ��������ϴ�.");
		
	}
}



