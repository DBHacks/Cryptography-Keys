package KeyStorage;

import java.math.BigInteger;
import Utility.CryptoTools;

public class DH_E8 {
	public static void main(String[] args) throws Exception
	{
		BigInteger p = new BigInteger("341769842231234673709819975074677605139");		//Public parameter p
		BigInteger g = new BigInteger("37186859139075205179672162892481226795");		//Public parameter g
		BigInteger aX = new BigInteger("83986164647417479907629397738411168307");		//Alice's private key
		BigInteger bX = new BigInteger("140479748264028247931575653178988397140");		//Bob's private key
		BigInteger bY = g.modPow(bX, p);
		BigInteger K = bY.modPow(aX, p);		//Session key
		
		byte[] key = K.toByteArray();
		
		System.out.println("Key = " + CryptoTools.bytesToHex(key));	//Test Case: 00C15A519D8BB2050044D9E7F9803CCF66
	}
}
