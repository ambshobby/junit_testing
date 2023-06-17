import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class App 
{

    public static void main(String[] args) throws Exception 
    
    {
        System.out.println("Hello, World!");
        //check(30,40);

    }

    public static int check(int x,int y )
    {
        return x+y;
    }

    @Test 
    public  void testme()throws Exception 
    {
        assertEquals(70,check(30,40));
    }

    
}
