package telran.calculator.dto;

public class CalculateData {
	public String operation;
	public int x;
	public int y;
	
	public CalculateData() {
	}
	
	public CalculateData(String operation, int x, int y) {
		this.operation = operation;
		this.x = x;
		this.y = y;
	}
	public String getOperation() {
		return operation;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
