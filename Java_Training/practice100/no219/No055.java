package Java_Training.practice100.no219;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class No055 {
	public static void main(String[] args) {
		File file = new File("C://work/project/kenshu/Systemi_Training_2020/Java_Training/practice100/no219/No055/test.txt");
		try{
			FileReader fr =new FileReader(file);
			BufferedReader bfr = new BufferedReader(fr);
			char ch;
			char fch='A';
			int countc =0;
			while((ch=(char)bfr.read())!=(char)-1){
				if(ch !='\n' && ch !='\r'){
					countc++;
				}
				fch=ch;
			}
			System.out.println(countc);
			bfr.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();

		}
		
	}
}