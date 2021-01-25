package array;

public class array01 {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 20;
		num[1] = 10;
		num[2] = 35;
		num[3] = 30;
		num[4] = 7;
		
		int maxNum = 0;
		int minNum = 0;
		for(int i=1;i<num.length;i++) {
			if(num[i-1]<num[i]) {
				maxNum = num[i];
			}
			if(num[i-1]>num[i]) {
				minNum = num[i];
			}
		}
		System.out.print(minNum);
		System.out.print(' ');
		System.out.print(maxNum);
	}
}
