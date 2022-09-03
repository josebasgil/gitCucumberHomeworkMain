package steps;

import pages.loginPage;
import utils.commonMethods;

public class pageInitializer {
    public static loginPage login;

    public static void initializePageObjects(){
        login = new loginPage();
    }

}
