package myawsomedomain.com.myapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UiTest
{
	Sample sample;

	@Rule
	public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, true, false);

	@Before
	public void setUp() throws Exception
	{
		sample = mock(Sample.class);

		when(sample.getSampleValue()).thenReturn(1.0);
	}

	@Test
	public void employeeSearchTest() throws InterruptedException
	{
		activityTestRule.launchActivity(null);

		double value = sample.getSampleValue();
	}
}
