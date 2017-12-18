import java.util.Scanner;
import humanize.morphCase;
public class StringCaseChange {
	private static Scanner scan = new Scanner (System.in);
	private static morphCase normalCase;
	public static void main (String[] args) {
		System.out.print("Enter String : ");
		normalCase = new morphCase(scan.nextLine());
		System.out.println("toUpperCase		: "+ normalCase.toUpperCase());
		System.out.println("toLowerCase		: "+ normalCase.toLowerCase());
		System.out.println("toCamelCase		: "+ normalCase.toCamelCase());
		System.out.println("toTitleCase		: "+ normalCase.toTitleCase());
		System.out.println("toConstantCase		: "+ normalCase.toConstantCase());
		System.out.println("toDotCase		: "+ normalCase.toDotCase());
		System.out.println("toHeaderCase		: "+ normalCase.toHeaderCase());
		System.out.println("toParamCase		: "+ normalCase.toParamCase());
		System.out.println("toPascalCase		: "+ normalCase.toPascalCase());
		System.out.println("toPathCase		: "+ normalCase.toPathCase());
		System.out.println("toSnakeCase		: "+ normalCase.toSnakeCase());
		System.out.println("swapCase			: "+ normalCase.swapCase());
	}
}