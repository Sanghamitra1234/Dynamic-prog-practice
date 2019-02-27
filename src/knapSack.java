
public class knapSack {
	static int [][] cache=new int[11][6];
	static int [] v={7,2,1,6,12};
	static int [] w= {3,1,2,4,6};	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int ans=ks(10,1,cache);
	  System.out.println(ans);
		}
	public static int ks(int c, int i, int[][]cache) {
		if(i>=5) {
			cache[c][i]=0;
			return cache[c][i];
		}
		if(c< w[i]) {
			if (cache[c][i+1] ==0 ) {
				cache[c][i+1]=ks(c,i+1,cache);
			}
			return cache[c][i+1];
		}
		else {
			if(cache[c][i+1]==0) {
				cache[c][i+1]=ks(c,i+1,cache);
			}
			if(cache[c-w[i]][i+1]==0) {
				cache[c-w[i]][i+1]=ks(c-w[i],i+1,cache);
			}
			return Math.max(cache[c][i+1], v[i]+cache[c-w[i]][i+1]);
		}
	}

}
