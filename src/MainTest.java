import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void returnAllBetweenZeroAndOneZeroFirstOneLast(){
        String number = "099991";
        String result = Main.allBetweenZeroAndOne(number);
        Assert.assertEquals("9999", result);
    }

    @Test
    public void returnAllBetweenZeroAndOneWithZeroAndOneInside(){
        String number = "990991324";
        String result = Main.allBetweenZeroAndOne(number);
        Assert.assertEquals("99", result);
    }

    @Test
    public void returnAllBetweenZeroAndOneWithFromSpoj(){
        String number = "12302198102";
        String result = Main.allBetweenZeroAndOne(number);
        Assert.assertEquals("2198", result);
    }

    @Test
    public void returnAllBetweenZeroAndOneWithEmpty(){
        String number = "23450132";
        String result = Main.allBetweenZeroAndOne(number);
        Assert.assertEquals("PUSTY", result);
    }

}
