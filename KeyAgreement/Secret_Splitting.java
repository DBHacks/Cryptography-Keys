package KeyAgreement;

import java.math.BigInteger;

public class Secret_Splitting {
	public static void main(String[] args) throws Exception
	{
		BigInteger m = new BigInteger("291639075201575653178417");		//Secret number m
		//5 keys all share equal strength, all 5 are needed to reconstitute the secrete, having 4 is the equivalent of having none
		BigInteger x1 = new BigInteger("431204871208734234238701");		//Key 1
		BigInteger x2 = new BigInteger("734601324098712347802342");		//Key 2
		BigInteger x3 = new BigInteger("120327146872342081734607502");	//Key 3
		BigInteger x4 = new BigInteger("234071543576518374193641923");	//Key 4
		BigInteger x5 = m.xor(x1.xor(x2.xor(x3.xor(x4)))); 
		System.out.println("Key 5: " + x5);		//Test Case: 196959590776100422981051255
		
		BigInteger check = x1.xor(x2.xor(x3.xor(x4.xor(x5))));	//must equal m
		System.out.println(check);		//Test Case: 291639075201575653178417
		
	}
}
