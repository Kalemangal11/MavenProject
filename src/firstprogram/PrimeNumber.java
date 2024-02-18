package firstprogram;

public class PrimeNumber {
public static void main(String[] args) {
	int cnt, i, j;
	for(i=1;i<=100;i++) {
		cnt=0;
		for(j=1;j<=i;j++) {
			if(i%j==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(i);
		}
	}
}
}
