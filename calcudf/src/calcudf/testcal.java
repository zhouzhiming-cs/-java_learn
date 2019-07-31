package calcudf;

import java.math.BigDecimal;

import org.apache.hadoop.hive.ql.exec.UDF;

public class testcal extends UDF {

	public int evaluate(String original) {

		 System.out.println("111");		 
         return 0;
    }
}
