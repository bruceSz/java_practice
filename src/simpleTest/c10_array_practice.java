package simpleTest;

import java.util.Arrays;

public class c10_array_practice {

	public static void findMin() {
		//int[] arr = {3,4,23,5,6,64,3};
		int[] arr = {2};
		int min = arr[0];
		System.out.println(arr.length);
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void exchangeRowCol() {
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("before");
		for(int i = 0; i< arr.length; i++) {
			for (int j = 0 ;j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("after");
		for (int i = 0; i< arr.length; i++){
			for (int j = 0;j<i; j++) {
				System.out.println("exchange: "+ arr[i][j] +" " + arr[j][i]);
				arr[i][j] =  arr[i][j]^arr[j][i];
				arr[j][i] = arr[i][j]^arr[j][i];
				arr[i][j] = arr[i][j]^arr[j][i];
				
			}
		}
		
		for (int i = 0; i<arr.length; i++ ){
			for (int j = 0 ;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void selectSort() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		for(int i = 0; i<arr.length; i++) {
			int min_index = i;
			for (int j = i; j<arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				arr[i] = arr[min_index]^arr[i];
				arr[min_index] = arr[i]^arr[min_index];
				arr[i] = arr[i]^arr[min_index];
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void bubbleSort() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		for (int i = arr.length-1; i >= 0; i--) {
			for(int j =0; j<i;j++){
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	private static void quick_sort(int[] arr, int begin, int end) {
		int low = begin; 
		int high = end;
		int pivet = low;
		low++;
		while (low < high) {
			/*while(arr[low] <= arr[pivet]) {
				low++;
			}*/
			while (low < high && arr[low] <= arr[pivet] ) 
				low++;
			while(high >low && arr[high] > arr[pivet])
				high--;
			if (low < high) {
				// exchange two of them.
				arr[low] = arr[low]^arr[high];
				arr[high] = arr[low]^arr[high];
				arr[low] = arr[low]^arr[high];
			}
		}
		// now low should be equal to high
		int target;
		if (arr[low] > arr[pivet]) {
			target = low-1;
		} else {
			target = low;
		}
		int tmp = arr[target];
		arr[target] = arr[pivet];
		arr[pivet] = tmp;
		/*arr[target] = arr[pivet]^arr[target];
		arr[pivet] = arr[target]^arr[pivet];
		arr[target] = arr[target]^arr[pivet];*/
		if ((target-1) > begin){
			quick_sort(arr, begin, target-1);
		}
		if ((target + 1) <end) {
			quick_sort(arr,target+1, end);
		}
		
	}
	public static void quickSort() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		quick_sort(arr,0,arr.length-1);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void insertSort() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		for (int i = 1; i< arr.length; i++) {
			int pivet = arr[i];
			for (int j=i-1; j>=0; j--){
				if (arr[j] > pivet) {
					arr[j+1] = arr[j];
				} else {
					arr[j+1] = pivet;
					break;
				}
			}
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
	
	public static void systemSort() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		Arrays.sort(arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
	
	public static void reverseArray() {
		int[] arr = {2,3,4,12,3,5,66,34,6,3};
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i< arr.length/2 ; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		//findMin();
		//exchangeRowCol();
		//selectSort();
		//bubbleSort();
		//quickSort();
		//insertSort();
		//systemSort();
		reverseArray();
		
		
	}
}
