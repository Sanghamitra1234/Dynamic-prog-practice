
public class LCS {
	public static void main(String[] args) {
	 String a="abcdef";
	 String b="ademn";
	  LCs(a,b);
	  //System.out.println(ans);
	}
	public static void LCs(String a, String b) {
		if(a.length()==0|| b.length()==0) {
			return;
		}
		String ans="";
		int [][] cache=new int[a.length()+1][b.length()+1];
		for(int i=1;i<=a.length();i++) {
			for(int j=1;j<=b.length();j++) {
				if(i==0 ||j==0) {
					cache[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					cache[i][j]=cache[i-1][j-1]+1;
					ans=ans+a.charAt(i-1);
				}
				else {
					cache[i][j]=Math.max(cache[i-1][j], cache[i][j-1]);
				}
			}
		}
		
		System.out.println("The length of the subsequence is "+ cache[a.length()][b.length()] +" and the subsequence is  "+ ans);
	}
}
