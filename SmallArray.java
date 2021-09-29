package Rabish;
import java.util.Scanner;
public class SmallArray {
	public static void s(int a[]) {
		int min=a[0];
		for(int j=0;j<a.length;j++) {
			if(min>a[j]) {
				min=a[j];
			}
		}
		System.out.println("the smallest number in the array is:"+min);
	}
	public static void main(String args[]) {
		int min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements in the array:");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		s(a);
	}

}
