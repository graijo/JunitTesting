import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;
/**
1-Any test method should be public and void
 becoz if some framework call from another package and the test has default and protected,it wont work.

 2-Add seperate test method for each condition so that when a test fail,you'll know which condition is affected
 */
public class StringHelperTest {
    StringHelper helper=new StringHelper();
    @Test
    public void should_Fail_When_NotImplemented(){
        fail("not implemented");
    }

    @Test
    public void should_RemoveFirst2A_When_PassString_to_truncateAInFirst2Positions(){

        StringHelper stringHelper=new StringHelper();
        /** 2-Add seperate test method for each condition so that when a test fail,you'll know which condition is affected
         */
        Assert.assertEquals("ACD",stringHelper.truncateAInFirst2Positions("AAACD"));
        Assert.assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
        Assert.assertEquals("CD",stringHelper.truncateAInFirst2Positions("CD"));
        Assert.assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void should_Success_When_areFirstAndLastTwoCharactersTheSameTest(){
        Assert.assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("AA find first stingAA"));
    }
    @Test
    public void should_Success_When_areFirstAndLastTwoCharactersTheSame2Test(){
        Assert.assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("AAAA"));
    }
    @Test
    public void should_Success_When_areFirstAndLastTwoCharactersTheSame3Test(){
        Assert.assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ssit on sandss"));
    }
    @Test
    public void should_Fail_When_areFirstAndLastTwoCharactersTheSameTest(){
        Assert.assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("find first sting"));
    }
    @Test
    public void should_Fail_When_areFirstAndLastTwoCharacters2TheSameTest(){
        Assert.assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame(""));
    }
    @Test
    public void should_Fail_When_areFirstAndLastTwoCharacters3TheSameTest(){
        Assert.assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ffind first sting"));
    }
    @Test
    public void should_Fail_When_areFirstAndLastTwoCharacters4TheSameTest(){
        Assert.assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("sit on sands"));
    }
}
