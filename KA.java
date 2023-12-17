//This Program Calculates The Key For Two Persons
//Using The Diffie-Hellman Key Exchange Algorithm

class KA{
	//Power nfunction to return value of a ^ b mod p
	private static long power(long a, long b, long p){
		if (b == 1)
			return a;
		else
			return (((long)Math.pow(a,b)) % p);
	}
	//Driver Code
	public static void main(String [] args){
		long P, G, x, a, y, b, ka, kb;
		//Both the persons will be agreed upon the 
		//public keys G and P
		//A prime number P is taken
		P = 23;	
		System.out.println("The Value Of P: " + P);
		//A primitive root for P, G, is taken
		G = 9;
		System.out.println("The Value Of G : " + G);
		//Alice will choose the private key a
		//a is the chosen private key
		a = 4;
		System.out.println("The Private Key a For Alice : " + a);
		//Gets the generated key
		x = power(G, a, P);
		//Bob will choose the private key b
		//b is the chosen private key
		b = 3;
		System.out.println("The Private Key b For Bob : " + b);
		//Gets the generated key
		y = power(G, b, P);
		//Generates the secret key after the exchange
		// of keys
		ka = power(y, a, P); //Secret key for Alice
		kb = power(x, b, P); //Secret key for Bob
		System.out.println("Secret Key For The Alice Is : " + ka);
		System.out.println("Secret Key For The Bob Is : " + kb);
	}
}