package hudson.plugins.build_timeout;

public class CommandLineEmailer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BuildEmailer.alert("Test subject", "TEST");
	}

}
