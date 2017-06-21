import java.util.Scanner;


public class LargestPossible {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of array:");
		int n=s.nextInt();
		int temp;
		int a[]=new int[n];
		System.out.print("The array elementsare :");
		for(int k=0;k<n;k++){
			a[k]=s.nextInt();
		}for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
		         }
		     		
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(+a[i]);
		}
	}
	}

