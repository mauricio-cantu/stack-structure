package stack;

public class StackUtils {

	public static <E> Stack<E> reverse(Stack<E> stack) {

		Stack<E> aux = new StaticStack<>(stack.numElements());

		while (!stack.isEmpty())
			aux.push(stack.pop());

		return aux;

	}

	public static void removeAll(Stack<?> stack) {
		if(stack == null)
			throw new IllegalArgumentException();
		removeAllR(stack);
	}
	
	private static void removeAllR(Stack<?> stack) {
		if(!stack.isEmpty()) {
			stack.pop();
			removeAllR(stack);
		}
	}
}
