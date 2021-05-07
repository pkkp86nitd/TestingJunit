import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAddTest {

    private Assertions Assert;

    @Test
    void getStr()
  {
      StringAdd str = new StringAdd("pankaj");
      assertEquals("pankaj",str.getStr());
  }

/*    @Test
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            StringAdd.add("1,2,3");
        });
    }*/
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringAdd.add("1,2");
        Assert.assertTrue(true);
    }
    @Test
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            StringAdd.add("1,X");
        });
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, StringAdd.add(""));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(3, StringAdd.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(100+1, StringAdd.add("100,1"));
    }

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, StringAdd.add("3,6,15,18,46,33"));
    }

    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15, StringAdd.add("3,6\n15"));
    }

    @Test
    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
        Assert.assertEquals(3+6+15, StringAdd.add("//;\n3;6;15"));
    }
}