
public class Problem05 {

	public static void main(String[] args) {

		int [] lottoNums = new int[6];
		
		for(int i=0;i<lottoNums.length;i++) {
		   lottoNums[i]=(int)(Math.random()*45)+1;
		   System.out.print(lottoNums[i]+" ");
			
		   for(int j=lottoNums[0] ;j<lottoNums.length;j++) {
				System.out.print(lottoNums[j]+" ");
			}
		}
		
	}

}
