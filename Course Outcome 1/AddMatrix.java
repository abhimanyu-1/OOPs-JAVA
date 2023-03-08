import java.util.Scanner;

public class AddMatrix{
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int[][] a= new int[3][3];
		int[][] b= new int[3][3];
		int[][] c= new int[3][3];
		
		System.out.println("Enter the size of first matrix :");
		int s1=s.nextInt();
		int s2=s.nextInt();
		
		System.out.println("Enter the matrix :");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter the next matrix :");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	System.out.println("Sum matrix:");
		for(int i=0;i<s1;i++) {
			System.out.println();
			for(int j=0;j<s2;j++) {
				System.out.println(" "+c[i][j]+" ");
			}
			System.out.println();
		}
}
}
