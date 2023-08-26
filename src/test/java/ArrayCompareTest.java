import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayCompareTest {
    @Test
    public void should_Success_When_CompareArray(){
        int [] a={5,1,77,32};
        int [] expected={1,5,32,77};
        Arrays.sort(a);
        Assert.assertArrayEquals(expected,a );

    }

    /**
     * Arrays.sort should throw null pointer exception when array is null
     * This is code being right
     * Absence of failure in Junit is success
     * This exception can be make it success for our test using
     * 1-try catch
     * 2-expected attribute(proper way)
     */
    @Test
    public void should_Error_When_Compare_NullArray(){
        int [] a=null;
        int [] expected={1,5,32,77};
        Arrays.sort(a);
        //null pointer,its expected so how to make ti successful in junit testing
        Assert.assertArrayEquals(expected,a );

    }
    @Test
    public void should_Error_When_Compare_NullArray_UsingTry(){
        int [] a=null;
        int [] expected={1,5,32,77};
        try {
            //is there a better way other than try catch
            Arrays.sort(a);
        }
        catch (Exception e){
//            Assert.assertArrayEquals(expected,a );
        }
    }
    @Test(expected = NullPointerException.class)
    public void should_Error_When_Compare_NullArray_UsingExpectedAttribute(){
        int [] a=null;
            Arrays.sort(a);
    }
    @Test
    public void should_success_When_Compare_EmptyArray_UsingExpectedAttribute(){
        int [] a= {};
        Arrays.sort(a);
        ObjectUtils.isEmpty(a);
    }

    /**
     * test performance bench mark
     * 1 milli second given as timeout
     */
    @Test(timeout = 50000)
    public void should_success_When_Compare_1MillionArray(){
        int [] a= {45,900,2,456,0,2};
        for(int i=0;i<=1000000;i++){
            a[0]=i;

            Arrays.sort(a);
            System.out.println(i+" th Sorted array is"+ReflectionToStringBuilder.toString(a));

        }
    }
}
