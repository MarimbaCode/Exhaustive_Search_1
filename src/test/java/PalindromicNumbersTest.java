import net.thejrdev.PalindromicNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromicNumbersTest {

    @Test
    public final void test0(){

        PalindromicNumbers nums = new PalindromicNumbers();
        assertEquals(5, nums.getPalindrome(5));

    }
    @Test
    public final void test1(){

        PalindromicNumbers nums = new PalindromicNumbers();
        assertEquals(9, nums.getPalindrome(10));

    }

}
