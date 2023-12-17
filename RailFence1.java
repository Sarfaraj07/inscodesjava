import java.io.*;

class RailFence{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Emter Plain Text : ");
		String pt = br.readLine();
		System.out.println("Enter Depth : ");
		int	d = Integer.parseInt(br.readLine());
		String ct = encrypt(ct, d);
		System.out.println("Encrypted Text : " + ct);
		String dText = decrypt(ct, d);
		System.out.println("Decrypted Text : " + dText);
	}
	
	public static String encrypt(String pt, int d){
		String ct = "";
		int r = 0, n = 1;
		String[] arr = new String[d];
		
		for(int i = 0; i < pt.length(); i++){
			if(arr[r] == null) arr[r] = "";
			arr[r] += pt.charAt(i);
			r += n;
		}
	}
}