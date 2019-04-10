import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackImplement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);        
		System.out.println("Stack Test\n");
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		ArrayStack stk = new ArrayStack(n);
		List<String> output = new ArrayList<>();
		for(int i=0;i<n;i++){
			String input = scan.next();
			int choice = 0;
			int data = 0;
			int incrementCount=0;
			if(input.contains("push")){
				choice = 1;
				data = Integer.valueOf(input.substring(input.length()-1));
			}else if(input.contains("pop")){
				choice = 2;
			}else if(input.contains("inc")){
				choice = 3;
				data = Integer.valueOf(input.substring(input.length()-1));
				incrementCount = Integer.valueOf(input.substring(input.length()-2,input.length()-1));
			}		
			switch (choice) {
			case 1 : 
				try {
					stk.push( data);
					output.add(stk.getTopElement());
				}catch (Exception e){
					System.out.println("Error : " + e.getMessage());
				}                         
				break;                         
			case 2 : 
				try{
					stk.pop();
					output.add(stk.getTopElement());
				}catch (Exception e){
					System.out.println("Error : " + e.getMessage());
				}    
				break;                         
			case 3 :         
				try{
					stk.inc(data,incrementCount);
					output.add(stk.getTopElement());
				}catch (Exception e){
					System.out.println("Error : " + e.getMessage());
				}
				break; 
			}
		}
		for(String out : output){
			System.out.println(out);
		}

	}

}
