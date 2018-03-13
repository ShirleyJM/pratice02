import java.util.Scanner;

public class problem02 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[] avgPg = new int[5]; 

		float avg=0f;
		int sum=0;
		
		for(int i=0;i<avgPg.length;i++) {
			int num = sc.nextInt();
			
			sum=sum+num;

			avg = sum/5;
			
		}
		System.out.println("평균은 "+avg+"입니다.");
		sc.close();
	}

}
