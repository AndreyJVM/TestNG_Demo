import org.testng.annotations.Test;
/**
 * Второй тест демонстрирующий работы аннотаций @BeforeXXX и @AfterXXX
 *
 * Методы не имеют сложной логики и нужны для информативности вывода
 * */

public class SecondBeforeAfterTest {

    @Test
    public void firstExampleMethodTest(){
        System.out.println("Class name - " + getClass().getSimpleName() + " --- Method firstExampleMethodTest ");
    }

    @Test
    public void secondExampleMethodTest(){
        System.out.println("Class name - " + getClass().getSimpleName() + " --- Method secondExampleMethodTest ");
    }

}
