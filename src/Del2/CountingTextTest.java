package Del2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingTextTest {
    @Test
    public void testCharCount(){
//        Arrange
        CountingText counter = new CountingText();
//        Act
        counter.addLine("Hej");
//        Assert
        assertEquals(3,counter.getCharCount());
    }

    @Test
    public void testLineCount(){
//        Arrange
        CountingText counter = new CountingText();
//        Act
        counter.addLine("Hej");
//        Assert
        assertEquals(1,counter.getLineCount());
    }

    @Test
    public void testIfTheEmptylineHasBeenCounted(){
//        Arrange
        CountingText counter = new CountingText();
//        Act
        counter.addLine("");
//        Assert
        assertEquals(1,counter.getLineCount());
    }
}
