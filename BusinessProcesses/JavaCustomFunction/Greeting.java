public class Greeting{
	public static String createGreeting(String name) {
		return "Hello, " + name;
	}
	
	public static final String[][] HELP_STRINGS = {
		{"createGreeting", "Creates a greeting", "createGreeting(\"Jane\")", "Hello, Jane"}
	};
}