package listeners;
import org.testng.ITestListener;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestNGListerner implements ITestListener {
	
@Test	(groups="reg1")

void loginbyemail()
{
	System.out.println("sai");
	Assert.assertEquals("pavan", "pavan");
}
@Test(groups="reg2")
void loginbyfacebook()
{
	System.out.println("king");
	Assert.assertEquals("sai", "sai");
	
}



	

	
}
