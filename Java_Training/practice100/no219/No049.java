package Java_Training.practice100.no219;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class No049 {
	public static void main(String[] args) {
		var d =LocalDate.now();
		var period =Period.ofDays(1);
		List<Date> l1 = new ArrayList<Date>();
		l1.add(d);
		l1.add(d.plus(period));
		l1.add(d.minus(period));
		
        
	}
}