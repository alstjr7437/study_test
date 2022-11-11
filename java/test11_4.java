package home1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test11_4 {

	public static void main(String[] args) throws Exception {
		//한글 설정을 위해 inputStream, outputStream 이용
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Home\\Desktop\\개발!\\score.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		BufferedReader fr = new BufferedReader(inputStreamReader);
		

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Home\\Desktop\\개발!\\scoreb.txt");
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter fw = new BufferedWriter(OutputStreamWriter);
		
		int count = 0;
		double sum = 0, max = 0, min = 0;
		String maxName = "", minName="";

		String s;
		while((s=fr.readLine()) != null) {
			//문자열로 받아온 값을 공백으로 잘라주고 이름과 점수 나누기!
			String[] a = s.split(" ");
			String name = a[0];
			double score = Double.parseDouble(a[1]);
			//점수를 비교하여 최고점수와 최저점수 계산하기!
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
		fr.close();
		
		fw.write("총 " + count + "명\n");
		fw.write("평균: " + sum / count + "\n");
		fw.write("최고점수: " + maxName + " " + max + "점\n");
		fw.write("최저점수: " + minName + " " + min + "점\n");
		fw.close();
		System.out.println("scoreb파일을 만들었습니다.");
	}

}
