package Key;

import java.lang.Math;

public class Secret_Sharing {
	public static void main(String[] args) throws Exception
	{
		int m = 44;		//Secret integer m
		int s1 = 3;		//Having 3 keys can reconstitute the secret, having 2 is the equivalent of having none
		int s2 = 4;
		int p = 101;
		
		int y1 = m + s1 + s2;
		Double y2 = m + s1*2 + s2*(Math.pow(2, 2));
		Double y3 = m + s1*3 + s2*(Math.pow(3, 2));
		Double y4 = m + s1*4 + s2*(Math.pow(4, 2));
		Double y5 = m + s1*5 + s2*(Math.pow(5, 2));
		
		System.out.println("Key 1: " + y1);		//Test Case: 51
		System.out.println("Key 2: " + y2);		//Test Case: 66
		System.out.println("Key 3: " + y3);		//Test Case: 89
		System.out.println("Key 4: " + y4);		//Test Case: 120
		System.out.println("Key 5: " + y5);		//Test Case: 159
		
		
	}
}
