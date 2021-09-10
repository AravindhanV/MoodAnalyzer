/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MoodAnalyzer;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyzerTest {
	@Test
	public void analyzeMood_SadMessage_SAD() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	public void analyzeMood_HappyMessage_HAPPY() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a happy message");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}

	@Test
	public void analyseMood_givenNullMood_HAPPY() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			String mood = moodAnalyzer.analyzeMood(null);
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
		}
	}
}
