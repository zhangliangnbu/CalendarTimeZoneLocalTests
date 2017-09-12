package com.liang.calendartimezonelocaltests;

import org.junit.Test;

import java.util.Locale;

/**
 *
 * Created by zhangliang on 12/09/2017.
 */

public class LocalTest {
	@Test
	public void testDefaultLocal() {
		Locale locale = Locale.getDefault();
		System.out.println("getDisplayName:" + locale.getDisplayName());

		System.out.println("getCountry:" + locale.getCountry());
		System.out.println("getDisplayCountry:" + locale.getDisplayCountry());
		System.out.println("getISO3Country:" + locale.getISO3Country());

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

}
