package sample;

public class test2 {
	public static void main ( String [] args) {
		int evenCount = 0 ;
		int evenSum = 0;
	for ( int i = 1; i <= 10 ; i ++) {
		if ( i % 2 == 0) {
			evenCount ++;
			evenSum += i;
		}
	}
	 System.out.println("偶数の個数： " +evenCount);
	 System.out.println("偶数の合計： " +evenSum);
	}

}
