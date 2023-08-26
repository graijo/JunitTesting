import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * make class run with parameterized class
 * steps
 * 1-@RunWith(Parameterized.class)
 * 2-@parameter annotated method to return a collection input and expected output
 * Covert array to collection---> Arrays.asList(arrVer)
 * create private instancevariable to hold iput and expected output
 * create constructor to pass values
 * use input and expectedoutput variable in @test methods
 *
 * 2 parameterized tests can not have in same class
 * parameterized method return collection,passed as constructor arguments and new instance of test is created
 * constuctor arguments are instance varibale which will accepts the values in
 */
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    StringHelper stringHelper;

    @Parameterized.Parameters
    public static Collection<String[]> conditions(){
String expectedOutput[][]={{"AAACD","ACD"},{"AA",""},{"Atf","tf"}};
return Arrays.asList(expectedOutput);

    }
 @Before
 public void setup(){
     stringHelper=new StringHelper();
 }
    @Test
    public void should_RemoveFirst2A_When_PassString_to_truncateAInFirst2Positions(){

        Assert.assertEquals(expectedOutput,stringHelper.truncateAInFirst2Positions(input));
    }


}
