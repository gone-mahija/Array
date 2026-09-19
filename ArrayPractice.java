
import java.util.Arrays;

class ArrayPrograms {

    public ArrayPrograms() {
    }

    public int maximumElement(int[] nums) {
        // Q1. Find the largest element in an array.
        // Example: Input: [3, 7, 2, 9, 4] ® Output: 9
        int maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }
        return maximum;
    }

    public int smallestElement(int[] nums) {
        // Q2. Find the smallest element in an array.
        // Example: Input: [3, 7, 2, 9, 4] ® Output: 2
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public float average(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return (float) sum / nums.length;
    }

    public int[] reverse(int[] nums) {
        int[] rev = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rev[j++] = nums[i];
        }
        return rev;
    }

    public int countEven(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdd(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int secondLargest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                first = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < first && nums[i] > second) {
                second = nums[i];
            }
        }
        return second;
    }

    public int secondSmallest(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < first) {
                first = num;
            }
        }
        for (int num : nums) {
            if (num > first && num < second) {
                second = num;
            }
        }
        return second;
    }

    public boolean isAscending(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] reverseInPlace(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public int[] copyElements(int[] nums) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        return copy;
    }

    public int searchElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int positiveNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    public int negativeNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public int evenSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int oddSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public int[] swapFirstLast(int[] nums) {
        int temp = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = temp;
        return nums;
    }

    public boolean isPresent(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public String commaSeperate(int[] nums) {
        // Print the array elements sepearated by commas
        String str = "";
        for (int num : nums) {
            str += String.valueOf(num) + ",";
        }

        return str.substring(0, str.length() - 1);
    }

    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums3[k++] = nums2[i];
        }
        return nums3;
    }

    public int[] insertElement(int[] nums, int position, int element) {
        nums = Arrays.copyOf(nums, nums.length + 1);
        for (int i = nums.length - 1; i > position; i--) {
            nums[i] = nums[i - 1];
        }
        nums[position] = element;
        return nums;
    }

    public int[] deleteElement(int[] nums, int position) {
        for (int i = position; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums = Arrays.copyOf(nums, nums.length - 1);
        return nums;
    }

    public int elementFrequency(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                count++;
        }
        return count;
    }

    public void sumTarget(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("(" + nums[i] + "," + nums[j] + ")");
                }
            }
        }
    }
}

class SlidingWindow {
    public SlidingWindow() {
    }

    public int maximumSum(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, sum);
        }

        return max;
    }

    public int[] firstNegative(int[] nums, int k) {
        int[] negatives = new int[nums.length - k + 1];
        int negative = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) {
                negative = nums[i];
                break;
            }
        }
        negatives[0] = negative;
        for (int i = 1; i <= nums.length - k; i++) {
            if (nums[i - 1] == negative) {
                for (int j = i; j < i + k; j++) {
                    if (nums[j] < 0) {
                        negatives[i] = nums[j];
                        negative = nums[j];
                        break;
                    }
                }

            } else {
                negatives[i] = negative;
            }
        }
        return negatives;
    }

    public int longestSubArray(int[] nums, int k) {
        int sum = 0;
        int j = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            while (sum > k) {
                sum = sum - nums[j];
                j++;
            }
            if (sum == k)
                max = Math.max(max, i - j + 1);
        }
        return max;
    }
}

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPrograms ap = new ArrayPrograms();
        System.out.println("Maximum element in an array is : " + ap.maximumElement(new int[] { 3, 7, 2, 9, 4 }));
        System.out.println("Smallest eleemnt in an array is : " + ap.smallestElement(new int[] { 3, 7, 2, 9, 4 }));
        System.out.println("Sum of elements :" + ap.sum(new int[] { 1, 2, 3, 4 }));
        System.out.println("Average of elements : " + ap.average(new int[] { 2, 4, 6, 8 }));
        System.out.println("Reverse of an array : " + Arrays.toString(ap.reverse(new int[] { 1, 2, 3 })));
        System.out.println("Number of even elements : " + ap.countEven(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println("Number of Odd elements : " + ap.countEven(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println("Second largest element in an array : " + ap.secondLargest(new int[] { 3, 7, 2, 9, 4 }));
        System.out.println("Second smallest element in an array : " +
                ap.secondSmallest(new int[] { 3, 7, 2, 9, 4 }));
        System.out.println("Is array sorted in ascending order : " + ap.isAscending(new int[] { 1, 2, 2, 4 }));
        System.out
                .println("Reverse an array in place : " + Arrays.toString(ap.reverseInPlace(new int[] { 1, 2, 3, 4 })));
        System.out
                .println(
                        "Copy elements from one array to another array : "
                                + Arrays.toString(ap.copyElements(new int[] { 5, 6, 7 })));
        System.out.println("Element found at index : " + ap.searchElement(new int[] { 4, 2, 7, 1 }, 7));
        System.out
                .println("Number of positive elements in an array : " + ap.positiveNumbers(new int[] { -1, 2, -3, 4 }));
        System.out
                .println("Number of negative elements in an array : " + ap.negativeNumbers(new int[] { -1, 2, -3, 4 }));
        System.out.println("Sum of even elements : " + ap.evenSum(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println("Sum of odd elements : " + ap.oddSum(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out
                .println("Swap first and last elements : "
                        + Arrays.toString(ap.swapFirstLast(new int[] { 1, 2, 3, 4 })));
        System.out.println("Whether the element is present or not : " + ap.isPresent(new int[] { 3, 6, 9 }, 6));
        System.out.println("Array Elements seperated by commas : " + ap.commaSeperate(new int[] { 1, 2, 3 }));

        System.out.println(
                "Merge two arrays : " + Arrays.toString(ap.mergeArrays(new int[] { 1, 2 },
                        new int[] { 3, 4 })));
        System.out.println("Insert an element at specific index : "
                + Arrays.toString(ap.insertElement(new int[] { 1, 2, 4, 5 }, 2, 3)));

        System.out
                .println(
                        "Delete an element at specific index : "
                                + Arrays.toString(ap.deleteElement(new int[] { 1, 2, 3, 4, 5 }, 2)));
        System.out.println("Frequency of an element : " + ap.elementFrequency(new int[] { 1, 2, 2, 3, 2 }, 2));
        ap.sumTarget(new int[] { 1, 2, 3, 4 }, 5);

        SlidingWindow sw = new SlidingWindow();
        System.out.println("Maximum sum of a subarray of size k : " + sw.maximumSum(new int[] { 2, 1, 5, 1, 3, 2 }, 3));
        System.out.println("First negative number in every window of size k : "
                + Arrays.toString(sw.firstNegative(new int[] { 12, -1, -7, 8, -15, 30 }, 3)));
        System.out.println("Length of the longest subarray with a sum equal to k : "
                + sw.longestSubArray(new int[] { 1, 2, 3, 7, 5 }, 12));
    }
}
