public class ReturnValue{
	public static int add(int numA, int numB) {
		int sum;
		sum = numA + numB;
		return sum;
	}
	public static void main(String[] args) {
		 ReturnValue r = new ReturnValue();
		int answer;
	answer = r.add(5,30);
	System.out.println(answer);
	}
}