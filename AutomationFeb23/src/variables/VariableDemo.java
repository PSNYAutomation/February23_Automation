package variables;

public class VariableDemo {

	public static void main(String[] args) {
		
		System.out.println("How are you?");
		
		String firstName = "Qazi";
		String lastName = "Ali";
		int zipCode = 11218;
		String house = "95 Louisa St.";
		
		System.out.println(firstName + " " + lastName + " " + 
		 "Lives in " + house);
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(76, 29));

	}

}
