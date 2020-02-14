package stack;

public class StaticStackTest {
	public static void main(String[] args) {
		Stack<Integer> s = new StaticStack<Integer>(10);
		try {
			s.push(1);
			s.push(2);
			s.push(3);
		} catch (OverflowException e) {
			e.printStackTrace();
		}
		try {
			while (!s.isEmpty()) {
				System.out.println(s.pop());
			}
		} catch (UnderflowException e) {
			e.printStackTrace();
		}
	}
}
