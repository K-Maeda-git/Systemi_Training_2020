package Java_Training.unit_10.practice.no217;
import java.util.stream.Stream;
	
public class Practice10_2_3_4 {
	public static void main(String[] args) {
	Stream.of("シュークリーム","プリン","マドレーヌ","ババロア")
	.sorted((str1,str2) -> 
	str2.length() - str1.length())
	.forEach(System.out::println);
	}
}
