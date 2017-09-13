package problem3;

public interface Question3 {
	public static int BinarySearch(int[] a, int target) {
		return BinarySearch(a, 0, a.length - 1, target);
	}

	public static int BinarySearch(int[] a, int start, int end, int target) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}
		if (target == a[middle]) {
			return middle;
		} else if (target < a[middle]) {
			return BinarySearch(a, start, middle - 1, target);
		} else {
			return BinarySearch(a, middle + 1, end, target);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 10, 35, 100, 300, 340, 560, 599, 100 };
		int index = BinarySearch(arr1, 0, arr1.length, 35);
		System.out.println("Found 35 at " + index + " index");
		int index1 = BinarySearch(arr1, 0, arr1.length, 100);
		System.out.println("Found 100 at " + index1 + " index");
		int index2 = BinarySearch(arr1, 0, arr1.length, 599);
		System.out.println("Found 599 at " + index2 + " index");
	}
}
