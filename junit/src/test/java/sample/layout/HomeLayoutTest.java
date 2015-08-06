/**
 * 
 */
package sample.layout;

import java.util.Arrays;

import org.junit.Test;

import sample.util.GalenBaseTest;

/**
 * @author mreinhardt
 *
 */
public class HomeLayoutTest extends GalenBaseTest {

	/**
	 * @param pTestDevice
	 */
	public HomeLayoutTest(TestDevice pTestDevice) {
		super(pTestDevice);
	}

	@Test
	public void shouldShowCorrectBaseLayout() throws Exception {
		verifyPage("/", "/specs/homePageLayout.spec", Arrays.asList("Homepage", "Bootstrap"));
	}

}
