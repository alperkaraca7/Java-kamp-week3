package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EmailLogger emailLogger = new EmailLogger();
		 * 
		 * emailLogger.Log("gmail");
		 */
		
		BaseLogger[] baseLoggers = {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.Log("log mesaji :)");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
		

	}

}
