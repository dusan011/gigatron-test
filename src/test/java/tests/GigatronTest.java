package tests;

import helpers.GigatronLogIn;
import org.junit.Test;

public class GigatronTest extends BaseTest
{
    @Test
    public void gigatronLogInTest()
    {
        GigatronLogIn gigatronLogInTest = new GigatronLogIn();
        gigatronLogInTest.gigatronLogIn();
    }
}
