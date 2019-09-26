import java.util.Arrays;
public class MergeSort implements SortingAlgorithm{

	public void merge(int[] a, int[] left, int[] right){
		int i = 0, j = 0, k = 0;
		while(i < left.length && j < right.length){
			if(left[i] <= right[j])
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
		}
		while(i<left.length)
			a[k++] = left[i++];
		while(j<right.length)
			a[k++] = right[j++];

	}
	public void sort(int a[]){
		if(a.length>1){
			int mid = a.length/2;
			int[]left = Arrays.copyOfRange(a, 0, mid);
			int[]right = Arrays.copyOfRange(a, mid, a.length);
			sort(left);
			sort(right);
			merge(a, left, right);
		}
	}
}