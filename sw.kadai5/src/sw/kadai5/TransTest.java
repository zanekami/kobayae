

public class TransTest {
	@Test
	public void test1桁() {
		IntToEng t = new IntToEng();
		String expected = "one-digit";
		String actual = t.translateEng(1);
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void zero() {
		ntToEng t = new IntToEng();
		String expected = "zero";
		String actual = t.translateEng(0);
		
		assertThat(actual,is(expected));
	}

}
