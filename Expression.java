package stack;

public class Expression {

	public static double eval(String exp) {
		Stack<Double> aux = new LinkedStack<>();
		for (String e : exp.split(" ")) {
			if ("+-/*^".contains(e))
				aux.push(evalCalc(aux.pop(), aux.pop(), e));
			else
				aux.push(Double.parseDouble(e));
		}

		return aux.pop();
	}

	public static boolean isProperlyParenthesized(String exp) {

		Stack<Character> aux = new LinkedStack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if (c == '(') {
				aux.push(c);
			} else if (c == ')') {
				if (aux.isEmpty())
					return false;
				aux.pop();
			}
		}

		return aux.isEmpty();

	}

	private static double evalCalc(double valor2, double valor1, String op) {
		switch (op) {
		case "+":
			return valor1 + valor2;
		case "-":
			return valor1 - valor2;
		case "/":
			return valor1 / valor2;
		case "^":
			return Math.pow(valor1, valor2);
		default:
			return valor1 * valor2;
		}
	}

}
