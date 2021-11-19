package mypkg;

public class CalculatorService {
	public static int doMath(int a, int b, String op)
	{
		int result;
		switch (op) {
		case "add":
			result = a + b;
		break;
		case "sub":
			result = a - b;
		break;
		case "mul":
			result = a * b;
		break;
		case "div":
			result = a / b; //egesz osztas
		break;

		default:
			throw new IllegalArgumentException("Unsupported operator");
		}
		
		return result;
	}
}
