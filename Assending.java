package Rabish;
import java.util.Scanner;
public class Assending {
	public static void assend(int a[]) {
		boolean flag=false;
		for(int j=0;j<a.length-1;j++) {
			if(a[j]<a[j+1]) {
			flag=false;	
			}
			else {
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elemets in array:");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		assend(a);
	}

}
