import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class p30 {
		public static void main(String[] args) {
			int sum = 0;
			int i = 2;
			for (int digits = 2; digits < 10; digits++) {
				int limit = (int)Math.pow(10, digits+1);
				while(i < limit) {
					i++;
					int temp_i = i;
					int T_sum = 0;
					while((double)temp_i / 10 > 1)
					{
						T_sum += Math.pow(temp_i % 10,5);
						temp_i /= 10;
					}
					T_sum += Math.pow(temp_i % 10,5);
					if(T_sum == i) {
						//System.out.println(i);
						sum+=T_sum;
					}
					T_sum = 0;
				}
				System.out.println(digits + " " + sum);
			}
			
	}
}
