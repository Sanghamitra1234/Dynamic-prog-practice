
public class longestpalindromicsubsequence {

	public static void main(String[] args) {
		String a="BBABCBCAB";
		int max=0;
		int[][] cache=new int[a.length()][a.length()];
		for(int i=0;i<a.length();i++) {
			cache[i][i]=1;
		}
		for(int l=2;l<a.length();l++) {
			for(int i=0;i<a.length()-l+1;i++) {
				int j=i+l-1;
			if(a.charAt(i)==a.charAt(j) ) {
				//System.out.println(a.charAt(i));
					cache[i][j]=cache[i+1][j-1]+2;
					max=Math.max(cache[i][j], max);
					}
				else {
					cache[i][j]=Math.max(cache[i+1][j],cache[i][j-1]);
				}
			}
		}
		System.out.println("The palindromic subsequence length is :" + max );

	}
	

}
