package chapter01;

public class Swap {
	
	public static void main (String[] args){
		
		int n1 =10;
		int n2=30;
		int temp=0;
		
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		if (n1 > n2){
			System.out.println("최대값은 "+n1+"입니다.");
		} else{
			temp = n1;
			n1 = n2;
			n2 = temp;
			
			System.out.println("최대값은"+n1+"입니다.");
		}
		// Q2: 최대값을 판별하는 조건을 완성해라.
		
		int a1=20;
		int a2 = 10;
		int a3=50;
		
		if (a1>=a2){
			if (a1>=a3){// a1이 가장 큰 경우
				System.out.println("최대값은"+a1+"입니다.");
			} else{ // a3가 가장 큰 경우 (a3 a1 a2)
				System.out.println("최대값은"+a3+"입니다.");
			}
		} else{
			if (a2>=a3){ // a2가 가장 큰 경우
				System.out.println("최대값은"+a2+"입니다.");
			} else{ //a3가 가장 큰 경우(a3 a2 a1)
				System.out.println("최대값은"+a3+"입니다.");
			}
		}
		
	}

}
