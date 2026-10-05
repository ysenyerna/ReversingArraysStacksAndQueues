import java.util.*;

public class Main {
    public static void main(String[] args) {
		System.out.println("--- Array, Stack, and Queue Reversal ---");
		System.out.println("----------------------------------------\n");

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many values would you like to enter? ");
		int valueCount = scanner.nextInt();
		System.out.println();

		int[] array = new int[valueCount];
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
	
		// Get input from the user
		for (int i = 0; i < valueCount; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			int input = scanner.nextInt();
			array[i] = input;
			stack.add(input);
			queue.add(input);
		}
		scanner.close();

		// Print original collections
		System.out.println("\nOriginal Collections: ");
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Stack: " + Arrays.toString(stack.toArray()));
		System.out.println("Queue: " + Arrays.toString(queue.toArray()));

		// Reverse the array
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			int pos = array.length - 1 - i;
			array[i] = array[pos];
			array[pos] = temp;
		}

		// Reverse stack
		Stack<Integer> reversedStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			reversedStack.add(stack.pop());
		}

		// Reverse queue
		Stack<Integer> queueReversal = new Stack<Integer>();
		// Add all queue elements to a stack
		while (!queue.isEmpty()) {
			queueReversal.add(queue.remove());
		}
		// Add the elements back into the queue
		while (!queueReversal.isEmpty()) {
			queue.add(queueReversal.pop());
		}

		// Print reversed collections
		System.out.println("\nReversed Collections: ");
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Stack: " + Arrays.toString(reversedStack.toArray()));
		System.out.println("Queue: " + Arrays.toString(queue.toArray()));

	}
}