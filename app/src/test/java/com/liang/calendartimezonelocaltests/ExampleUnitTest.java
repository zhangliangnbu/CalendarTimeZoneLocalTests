package com.liang.calendartimezonelocaltests;

import org.junit.Test;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
	@Test
	public void addition_isCorrect() throws Exception {
		assertEquals(4, 2 + 2);
	}

	@Test
	public void testDefaultLocal() {
		Locale locale = Locale.getDefault();
		System.out.println("getDisplayName:" + locale.getDisplayName());

		System.out.println("-----Country------");
		System.out.println("getCountry:" + locale.getCountry());
		System.out.println("getDisplayCountry:" + locale.getDisplayCountry());
		System.out.println("getISO3Country:" + locale.getISO3Country());

		System.out.println("-----Language------");
		System.out.println("getDisplayLanguage:" + locale.getDisplayLanguage());
		System.out.println("getISO3Language:" + locale.getISO3Language());
		System.out.println("getLanguage:" + locale.getLanguage());

		System.out.println("getScript:" + locale.getScript());
		System.out.println("getDisplayScript:" + locale.getDisplayScript());

		System.out.println("getVariant:" + locale.getVariant());
		System.out.println("getDisplayVariant:" + locale.getDisplayVariant());

		System.out.println("getExtensionKeys:" + locale.getExtensionKeys());
		System.out.println("getUnicodeLocaleAttributes:" + locale.getUnicodeLocaleAttributes());
		System.out.println("getUnicodeLocaleKeys:" + locale.getUnicodeLocaleKeys());
		System.out.println("toLanguageTag:" + locale.toLanguageTag());
	}

	@Test
	public void testCHINA() {
		Locale locale = Locale.CHINA;
		System.out.println("getDisplayName:" + locale.getDisplayName());

		System.out.println("-----Country------");
		System.out.println("getCountry:" + locale.getCountry());
		System.out.println("getDisplayCountry:" + locale.getDisplayCountry());
		System.out.println("getISO3Country:" + locale.getISO3Country());

		System.out.println("-----Language------");
		System.out.println("getDisplayLanguage:" + locale.getDisplayLanguage());
		System.out.println("getISO3Language:" + locale.getISO3Language());
		System.out.println("getLanguage:" + locale.getLanguage());

		System.out.println("getScript:" + locale.getScript());
		System.out.println("getDisplayScript:" + locale.getDisplayScript());

		System.out.println("getVariant:" + locale.getVariant());
		System.out.println("getDisplayVariant:" + locale.getDisplayVariant());

		System.out.println("getExtensionKeys:" + locale.getExtensionKeys());
		System.out.println("getUnicodeLocaleAttributes:" + locale.getUnicodeLocaleAttributes());
		System.out.println("getUnicodeLocaleKeys:" + locale.getUnicodeLocaleKeys());
		System.out.println("toLanguageTag:" + locale.toLanguageTag());
	}

	@Test
	public void testTimeZone() {
//		String[] ids = TimeZone.getAvailableIDs();
//		System.out.println(Arrays.toString(ids));

//		TimeZone defaultTZ = TimeZone.getDefault();
		TimeZone defaultTZ = TimeZone.getTimeZone("GMT+08:00");
		System.out.println("getDisplayName:" + defaultTZ.getDisplayName());
		System.out.println("getID:" + defaultTZ.getID());
		System.out.println("getDSTSavings:" + defaultTZ.getDSTSavings());
		System.out.println("observesDaylightTime:" + defaultTZ.observesDaylightTime());
		System.out.println("getRawOffset:" + defaultTZ.getRawOffset() / 3600000);
	}

	@Test
	public void testCalendar() {
//		Calendar calendar = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"), Locale.CHINA);
		System.out.println("getTimeZone().getDisplayName():" + calendar.getTimeZone().getDisplayName());
		System.out.println("getTimeZone().getRawOffset():" + calendar.getTimeZone().getRawOffset() / 3600000);

		System.out.println("DAY_OF_WEEK:" + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH:" + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("WEEK_OF_YEAR:" + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH:" + calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DAY_OF_MONTH:" + calendar.get(Calendar.DAY_OF_MONTH));

		System.out.println("getDisplayName:" + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CHINA));
		System.out.println("getDisplayNames:" + calendar.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CHINA));
		System.out.println("getDisplayName:" + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.CHINA));


//		 getTimeZone().getDisplayName():GMT+08:00
//		 getTimeZone().getRawOffset():8
//		 DAY_OF_WEEK:3
//		 DAY_OF_WEEK_IN_MONTH:2
//		 WEEK_OF_YEAR:37
//		 WEEK_OF_MONTH:3
//		 DAY_OF_MONTH:12
//		 getDisplayName:星期二
//		getDisplayNames:{星期二=3, 星期六=7, 星期三=4, 星期四=5, 星期五=6, 星期日=1, 星期一=2}

	}

	// * @see java.text.Format
// * @see java.text.NumberFormat
// * @see java.text.Collator

	@Test
	public void testNumberFormat() {

	}

	@Test
	public void testSimpleDateFormat() {
	}


}