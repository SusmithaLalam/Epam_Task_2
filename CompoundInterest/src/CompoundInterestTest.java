import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CompoundInterestTest {
	@Test
	void testSimpleIntrest() {
		CompoundInterest simpleInterest = new CompoundInterest(1200, 5.4f, 2);
		assertEquals(129.60000610351562, simpleInterest.getSimpleInterest());
//		simpleIntrest = new CompoundInterest(1200, 5.4f, 2);
//		assertEquals(228.21, simpleIntrest.getSimpleInterest());
	}
	@Test
	void testCompoundIntrest() {
		CompoundInterest compoundInterest = new CompoundInterest(1200, 5.4f, 2);
		assertEquals(1333.099250660706, compoundInterest.getCompoundInterest());
//		compoundIntrest = new CompoundInterest(1200, 5.4f, 2);
//		assertEquals(2826.96182, compoundIntrest.getCompoundInterest());
	}
}