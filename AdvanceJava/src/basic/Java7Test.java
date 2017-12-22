package basic;

public class Java7Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1_00_000;
		System.out.println(value);
		String key = "one";
		switch (key) {
		case "one":
			System.out.println("The value is one");
			break;

		default:
			System.out.println("The value isn't one");
			break;
		}
	}

}
