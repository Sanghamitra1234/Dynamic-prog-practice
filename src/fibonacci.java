import java.io.*;
import java.util.*;

public class fibonacci {
	public static int fib(int n, int[] cache) {
		//value already in cache n the return it
		if(n==0) {
			return 0;
		}
		cache[1]=1;
		if(cache[n]>0) {
			return cache[n];
		}
		// if not calculate it
		cache[n]=fib(n-1,cache)+fib(n-2,cache);
		return cache[n];
		
	}
    public static void main(String [] args) throws IOException {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	String s=br.readLine();
    	int n=Integer.parseInt(s);
    	int [] cache=new int[n+1];
    	int ans=fib(n,cache);
    	System.out.println(ans);
    	
    }
}
