package blockchain.wallet;

import blockchain.wallet.interfaces.Wallet;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;

public class ECWallet implements Wallet {
	
	public static void main(String [] args) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
		ECGenParameterSpec ecGenSpec = new ECGenParameterSpec("secp256k1");
		KeyPairGenerator g = KeyPairGenerator.getInstance("EC","SunEC");
		g.initialize(ecGenSpec, new SecureRandom());
		KeyPair pair = g.generateKeyPair();
		
		System.out.println(pair.getPublic());
		
	}

}
