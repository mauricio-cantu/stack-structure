package stack;

public class LinkedStackTest {
	public static void main(String[] args) {
		Stack<Integer> s = new LinkedStack<Integer>();

//		System.out.println(Expression.eval("4 2 5.5 * + 1 3 2 * + /"));

		System.out.println(Expression.isProperlyParenthesized("1 + 2 * 3 � (4 + 5)"));

//		try {
//			s.push(8);
//			s.push(9);
//			s.push(10);
//			s.push(3);
//
////			System.out.println("Antes invers�o: " + s);
////			StackUtils.reverse(s);
////			System.out.println("Depois invers�o: " + s);
//
//			System.out.println("\n\n");
//
//			System.out.println("Antes remo��o: " + s);
//			StackUtils.removeAll(s);
//			System.out.println("Depois remo��o: " + s);
//		} catch (UnderflowException e) {
//			System.out.println(e);
//		}
	}
}
