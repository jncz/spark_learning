package spark;

import org.apache.spark.deploy.SparkSubmit;


public class Test {
	private static String appName = "appname";
//	private static String master = "spark://lipingVbox:7077";
	private static String master = "local[*]";

	public static void main(String[] args){
		SparkSubmit.main(args);
	}
}
