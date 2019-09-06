package BasicPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153,i=0,j=0;
		int duplicate=num;
		while (num>0) {
		i=num%10;
		j=j+(i*i*i);
		num=num/10;
		}
		if (duplicate==j) {
		System.out.println("Amstrong No");
		} else {
		System.out.println("Not an Amstrong No");
		}
		}
}
