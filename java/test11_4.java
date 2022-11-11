package home1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test11_4 {

	public static void main(String[] args) throws Exception {
		//�ѱ� ������ ���� inputStream, outputStream �̿�
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Home\\Desktop\\����!\\score.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		BufferedReader fr = new BufferedReader(inputStreamReader);
		

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Home\\Desktop\\����!\\scoreb.txt");
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter fw = new BufferedWriter(OutputStreamWriter);
		
		int count = 0;
		double sum = 0, max = 0, min = 0;
		String maxName = "", minName="";

		String s;
		while((s=fr.readLine()) != null) {
			//���ڿ��� �޾ƿ� ���� �������� �߶��ְ� �̸��� ���� ������!
			String[] a = s.split(" ");
			String name = a[0];
			double score = Double.parseDouble(a[1]);
			//������ ���Ͽ� �ְ������� �������� ����ϱ�!
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
		
		fw.write("�� " + count + "��\n");
		fw.write("���: " + sum / count + "\n");
		fw.write("�ְ�����: " + maxName + " " + max + "��\n");
		fw.write("��������: " + minName + " " + min + "��\n");
		fw.close();
		System.out.println("scoreb������ ��������ϴ�.");
	}

}
