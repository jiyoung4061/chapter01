package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		//암시적(implicity) casting = 오른쪽편이 작은경우!
		int i1=9999;
		long l1=i1;
		
		//명시적(explicity) casting = 왼족이 작은경우!
		long l2 = 923456789823L;
		int i2 = (int) l2; 
		
		System.out.println(l1+":"+i1);
		System.out.println(l2+":"+i2);

	}

}
