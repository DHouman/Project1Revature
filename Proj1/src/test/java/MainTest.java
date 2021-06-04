import io.javalin.Javalin;
import io.javalin.http.Context;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest
{
    Javalin app;

    @BeforeClass
    public static void beforeClass()
    {
        Javalin app = Javalin.create(config -> config.addStaticFiles("/")).start(8080);//Start the Javalin app
    }
    @Test
    public void testMain()
    {

    }
    @Test
    public void testTestGetName()
    {
         Main billy = new Main();

        Context ctx = mock(Context.class);
        when(ctx.formParam("employeeName")).thenReturn("joe");
        Boolean actual = billy.getName(ctx);
        Assert.assertTrue(actual);

//        ctx.formParam("employeeName") = "joe";
//        //String actual = ctx.formParam("employeeName");
//
//        Boolean actual = getName(ctx);
    }
}
