package tests;

import helpers.GigatronLogIn;
import org.junit.Test;

public class GigatronTest extends BaseTest
{
    @Test
    public void gigatronLogInTest() throws InterruptedException {
        GigatronLogIn gigatronLogInTest = new GigatronLogIn(driver);
        gigatronLogInTest.gigatronLogIn();
    }
}
