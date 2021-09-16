import java.util.*;

public class p30 {
		public final static int arbitrarya_amount_of_digits = 10;
		public static void main(String[] args) {
			Vector<Integer> Inputs = new Vector<Integer>();
			Vector<Integer> outputs = new Vector<Integer>();
			
			Inputs.add(4);
			outputs.add(19316);
			
			
			Test(Inputs,outputs);
			System.out.println("The answer is:" + p30(5));
		}
		public static int p30(int power)
		{
			int sum = 0;
			int i = 2;
			for (int digits = 2; digits < arbitrarya_amount_of_digits; digits++) {
				int iter_sum = sum;
				int limit = (int)Math.pow(10, digits+1);
				while(i < limit) {
					i++;
					int temp_i = i;
					int T_sum = 0;
					while((double)temp_i / 10 > 1)
					{
						T_sum += Math.pow(temp_i % 10,power);
						temp_i /= 10;
					}
					T_sum += Math.pow(temp_i % 10,power);
					if(T_sum == i) {
						sum+=T_sum;
					}
					T_sum = 0;
				}
				if(iter_sum == sum && sum != 0)
					return sum;
			}
			return sum;
		}
		public static void Test(Vector<Integer> Inputs,Vector<Integer> Excpected_Outputs)
		{
			int i = 1;
			for (Integer num : Inputs) {
				System.out.print("Test number " + i +":");
				if(p30(num) == Excpected_Outputs.elementAt(i-1))
					System.out.println("Passed");
				else
					System.out.println("Failed");
				i++;
			}
		}
}
