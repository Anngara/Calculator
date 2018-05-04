package telran.calculator;
import java.util.*;
import java.util.function.BinaryOperator;

public class Calculator {
	static HashMap<String, BinaryOperator<Integer>> operations;
	static {
		operations = new HashMap<>();
		operations.put("+", (x, y) -> (x + y));
		operations.put("-", (x, y) -> (x - y));
		operations.put("*", (x, y) -> (x * y));
		operations.put("/", (x, y) -> (x / y));

	}

	Set<String> getOperations() {
		return operations.keySet();
	}

	int getResult(String operation, int x, int y) {
		BinaryOperator<Integer> operator = operations.get(operation);
		if (operator == null) {
			return Integer.MAX_VALUE;
		} else {
			return operator.apply(x, y);
		}
	}

}
