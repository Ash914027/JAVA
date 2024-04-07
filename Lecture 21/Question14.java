import java.util.Scanner;
Write a class SequenceCount with a public method sequenceCount that takes one parameter arr of type int[] and returns the sequence count 1,1 in the arr. The return type of sequenceCount should be int.

Assumptions:
arr is never null
Overlapping of counting is allowed
Here is an example:
Enter no of elements in the array:
7
Enter elements in the array seperated by space:
1 -1 1 1 1 2 3 1
2

package q11062;

public class SequenceCount {
	/**
	 * Find the sequence count 1,1 int given array
	 * 
	 * 
	 * @return count
	 */
	 
	public int sequenceCount(int[] a) {
		
		//Write your code here
		int count=0;
		//if(a.length==1){
		//	if(a[0]==1){
		//		count=1;
		//		return 1;
		//	}
	//	}
		for(int i=0;i<a.length-1;i++){
			if(a[i]==1 && a[i+1]==1 ){
				count++;
			}
		}
		return count;
	}	
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no of elements in the array:");
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter elements in the array separated by space:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		SequenceCount sequenceCount = new SequenceCount();
		int count = sequenceCount.sequenceCount(arr);
		System.out.println(count);
	}
}
	
	
