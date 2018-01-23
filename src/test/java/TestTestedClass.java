import org.junit.Assert;
import org.junit.Test;

public class TestTestedClass {

    @Test
    public void testPositive() {
        TestedClass testedClass = new TestedClass();
        Assert.assertTrue(testedClass.checkPositive(1));
    }

    @Test
    public void testDivideByTwo() {
        TestedClass testedClass = new TestedClass();
        Assert.assertTrue(testedClass.checkIfDividableByTwo(6));
    }
    //
}
