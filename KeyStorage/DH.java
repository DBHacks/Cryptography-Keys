package KeyStorage;

import java.math.BigInteger;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import Utility.CryptoTools;

public class DH {
	public static void main(String[] args) throws Exception
	{
		BigInteger p = new BigInteger("1426978031065901624399459"); 	//prime modulus
		BigInteger g = new BigInteger("142983226354603241203899");   	//primitive root
		BigInteger aX = new BigInteger("632622147039135551858685");  	//Alice's DH private
		BigInteger bY = new BigInteger("1292231164656860363954990"); 	//Bob's DH public
		String c = "60EDD15697E62C54C1BC7DDABF05C52A"; 	//The received DES/ECB/PKCS5Padding ciphertext 0x
		BigInteger K = bY.modPow(aX, p);
		
		
		byte[] ct = CryptoTools.hexToBytes(c);
		byte[] temp = K.toByteArray();
		String temp2 = CryptoTools.bytesToHex(temp); 	//00EC04B7F86CCA2C6D9B87
		byte[] ky = CryptoTools.hexToBytes("00EC04B7F86CCA2C");
		
		Key secret = new SecretKeySpec(ky, "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, secret);
		byte[] pt = cipher.doFinal(ct);
		
		System.out.println("PT = " + new String(pt) + "<");		//Test Case: marriage<
	}
}
