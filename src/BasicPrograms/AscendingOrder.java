package BasicPrograms;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[]= {10,100,90,70,20};
		int temp=0,len=a.length;
		for (int i = 0; i < len; i++) {
		for (int j = i+1; j < len; j++) {
		if (a[i]>a[j]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		 

		}
		}
		for (int i = 0; i < len; i++) {
		System.out.println(a[i]); 
		}
		}
}
