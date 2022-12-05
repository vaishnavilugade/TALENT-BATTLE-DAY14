import java.util.*;
class Strong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,temp=1,k,fact=0;
		System.out.println("Enter Number:");
		n=sc.nextInt();
		k=n;
		while(n !=0){
			int rem = n % 10; 
			int count=1;
			for(int i=1;i<=rem;i++){
				count=count*i;
			}
			fact=count+fact;
			n=n/10;
		}
		System.out.println("factorial:"+fact);
		if(k==fact){
			System.out.println(k+" is a strong number");
		}
		else if(k!=fact){
			System.out.println(k+" is not a strong number");
		}
			
			
	}
}



