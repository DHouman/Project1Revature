import io.javalin.Javalin;
import io.javalin.http.Context;

//import org.apache.logging.log4j.LogManager;


public class Main
{
    //org.apache.logging.log4j.Logger rootLogger = LogManager.getRootLogger();
    //need help with the logger.

    public static void main(String[] args)
    {
        //this is front end to back end shenanigans
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.render("/main.html"));

        //window.location.href = "http://example.com/new_url";

        System.out.println("Got past the get/render statement");

        app.post("/employeeHome",ctx->
        {

//            System.out.println("Got within the post statement");
//            String pass = ctx.formParam("employeePass");
//            System.out.println(pass);
//            if(getName(ctx))
//            {
            //put all login info stuff here

//                System.out.println("Got within the if statement");
                ctx.redirect("/_home");
                //javalin.get("/mployeeHome.html",ctx->{...})


            //}
        });
        app.get("/_home", ctx->
        {
            ctx.render("employeeHome.html");
        });
    }
    public static boolean getName(Context ctx)//idk if boolean or void
    {
        String ename = ctx.formParam("employeeName");
        //radio button thing here.
        //ctx.formParam("radioButton");
        if(ename.equals("joe"))
        {
            return true;
        }
        //grabs the fname when it is submitted and bring it here
        System.out.println(ename);
        return false;

    }

}
// some people did

//TEST STUFF
//Context ctx = mock(Context.class);
//have the above in the test class scope
/*
put this above the call function
when(ctx.formParam("fname")).thenReturn("whateveriwant");
 */