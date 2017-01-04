package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int month=10;
		int days=0;
		
		if(month ==1){
			days=31;
		} else if(month==2){
			days=28;
		}else if(month==3){
			days=31;
		}else if(month==4){
			days=30;
		}else if(month==5){
			days=31;
		}else if(month==6){
			days=30;
		}else if(month==7){
			days=31;
		}else if(month==8){
			days=31;
		}else if(month==9){
			days=30;
		}else if(month==10){
			days=31;
		}else if(month==11){
			days=30;
		}else if(month==12){
			days=31;
		} else {
			days=0;
		}
		
		
		System.out.println(month+"월은 "+days+"일이 있습니다.");
		
		// switch-> break문 꼭 써야함 안그러면 다음조건으로 넘어감
		// break 문을 안쓸때? 31일 처리할때 31일인 달 다 모아서 처리 다 빼고 마지막에만 처리하고 break
		switch(month){
		case 1:{
			days=31;
			break;
		}
		case 2:{
			days=28;
			break;
		}
		case 3:{			
			days=31;
			break;
		}
		case 4:{
			days=30;
			break;
		}
		case 5:{
			days=31;
			break;
		}
		case 6:{
			days=30;
			break;
		}
		case 7:{
			days=31;
		}
		case 8:{
			days=31;
		}
		case 9:{
			days=30;
		}
		case 10:{
			days=31;
		}
		case 11:{
			days=30;
		}
		case 12:{
			days=31;
		}
		default:{
			System.out.println("해당월이 없습니다.");
		}
		}
		
		System.out.println(month+"월은 "+days+"일이 있습니다.");
	}

}
