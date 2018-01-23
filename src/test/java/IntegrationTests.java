import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class IntegrationTests {

    @Test
    public void testPositive() {
        TestedClass testedClass = new TestedClass();
        Assert.assertTrue(testedClass.checkPositive(1));
    }


}
