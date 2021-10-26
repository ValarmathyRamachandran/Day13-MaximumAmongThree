package bridgeLabz.Java.Practice;
import org.junit.Assert;
import static org.junit.Assert.*;	

class MaximumAmonyThreeTest {

		@Test
		 void integerMax() {
	        int actualResult = MaximumAmongThree.findMaximum(8,10,6);
	        Assert.assertEquals(10);
	        System.out.println(actualResult);
	    }

		@Test
		 void floatMax() {
	        float actualResult = MaximumAmongThree.findMaximum(7.42f,8.6f,3.4f);
	        Assert.assertEquals(8.6f);
	        System.out.println(actualResult);
	    }

	    @Test
	     void StringMax() {
	        String actualResult = MaximumAmongThree.findMaximum("Apple","Banana", "Mango");
	        Assert.assertEquals("Mango");
	        System.out.println(actualResult);
	    }

	}
