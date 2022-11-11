package home1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test11_3 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new FileReader("C:\\Users\\Home\\Desktop\\개발!\\score.txt"));
		FileWriter fw = new FileWriter("C:\\Users\\Home\\Desktop\\개발!\\scoreb.txt");
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
		
		fw.write("총 " + count + "명 \n");
		fw.write("평균:" + sum / count + "\n");
		fw.write("최고점수:" + maxName + max + "\n");
		fw.write("최저점수:" + minName + min + "\n");
		fw.close();
		System.out.println("scoreb파일을 만들었습니다.");
		
	}
}



