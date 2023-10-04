import org.testng.annotations.Test;

public class FirstBeforeAfterTest {

    @Test
    public void firstExampleMethodTest(){
        System.out.println("Class name - " + getClass().getSimpleName() + " --- Method firstExampleMethodTest ");
    }

    @Test
    public void secondExampleMethodTest(){
        System.out.println("Class name - " + getClass().getSimpleName() + " --- Method secondExampleMethodTest ");
    }
}
