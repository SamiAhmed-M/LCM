package com.lcm.multiple;
/**Given four integers find the least common multiple  */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.Arrays;

@SpringBootApplication
public class MultipleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleApplication.class, args);
		Scanner myObj = new Scanner(System.in);
		// prompt user
		System.out.println("Please enter four integers to find the least common multiple for");
		int []arr = new int[4];
		for (int i=0;i<4;i++) {
			arr[i] = myObj.nextInt();
		}
		myObj.close();
		
		Calculate calc = new Calculate();
		System.out.println("LCM is: " + calc.multiple(arr));
	}

}

class Calculate{
	
	public int multiple(int []arr)
	{
		// sor the arrays to identify the smallest of the input elements
		Arrays.sort(arr);   // ASC order
		int prod = 1, LCM = 0;
		outer: for (int i=1; i<=100; i++)
		{
			prod = arr[0] * i;
			if (prod % arr[1] == 0 && prod % arr[2] == 0 && prod % arr[3] == 0)
			{
				LCM = prod;
				break outer;
			}
			else
			{
				LCM = -1;
			}
		}
		return LCM;
		
	}
	
}