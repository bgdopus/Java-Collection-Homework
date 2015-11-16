import java.util.Arrays;
import java.util.Scanner;



public class _1_SortArray{

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	scanner.nextLine();
	int[] nums = new int[n];
	for (int i = 0; i < nums.length; i++) {
	    nums[i] = scanner.nextInt();
	}
	Arrays.sort(nums);
	System.out.println();
	for (int i : nums) {
	    System.out.printf("%d ", i);
	}
    }

}