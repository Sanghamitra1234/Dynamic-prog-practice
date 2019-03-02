
public class longestcommonsubstring {
 public static int lcs(String a, String b) {
	 int [][] cache=new int[a.length()+1][a.length()+1];
	 int max=0;
	 for(int i=0;i<=a.length();i++) {
		 for(int j=0;j<=b.length();j++) {
			 if(i==0 || j==0) {
				 cache[i][j]=0;
			 }
			 else if(a.charAt(i-1)==b.charAt(j-1)) {
				 cache[i][j]=cache[i-1][j-1]+1;
				 max=Math.max(max, cache[i][j]);
			 }
			 else {
				 cache[i][j]=0;
			 }
			 
		 }
	 }
	 return max;
 }
 public static void main(String[] args) {
	 String a="ababc";
	 String b="babca";
	 int ans=lcs(a,b);
	 System.out.println(ans);
 }
}
