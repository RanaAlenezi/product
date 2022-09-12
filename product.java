import java.util.Scanner;
public class product{
	
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];

		int[] b=new int[5];
						System.out.println("write five numbers of integers");

			for(int i=0;i<=a.length-1;i++){
				a[i]=input.nextInt();
System.out.print(a[i]);		
			}
												System.out.println("write also five numbers of integers");

				for(int j=0;j<=b.length-1;j++){

					b[j]=input.nextInt();				

System.out.print(b[j]);	

	}
				
	System.out.println("Solution:");
	System.out.println(product(a,b));
	

		
	}
	public static int[] product(int[] a,int[] b){
		int c[]=new int[5];
		for(int T=0;T<=c.length-1;T++){
			c[T]=a[T]*b[T];
			
			System.out.println(c[T]);
			
		}
	return c;
	}
}