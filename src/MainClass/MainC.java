package MainClass;

import MainClass.BuildExpressionForCron;

public class MainC {
	
	public static void main(String[] args) {
		BuildExpressionForCron obj = new BuildExpressionForCron();
		System.out.println(obj.buildCronExp(args));
	}

}
