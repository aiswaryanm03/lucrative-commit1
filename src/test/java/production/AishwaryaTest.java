package production;

import org.testng.annotations.Test;

public class AishwaryaTest {
	@Test
	public void Run()
	{
		String Browser=System.getProperty("browser");
		System.out.println(Browser);
		String Url=System.getProperty("url");
		System.out.println(Url);
		System.out.println("hi ");
		System.out.println("hi from aish");
		System.out.println("to run in jenkins");


	}

}
