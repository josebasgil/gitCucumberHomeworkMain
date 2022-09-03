package steps;

import org.junit.After;
import org.junit.Before;
import utils.commonMethods;

public class hooks extends commonMethods {

    @Before
    public void start(){openBrowserAndLaunchApplication();}

    @After
    public void end(){closeBrowser();}

}
