package resources.lang;

import java.util.ResourceBundle;

public class Language {

	public static String get(String selector) {
		return ResourceBundle.getBundle("resources.lang.lang", settings.Settings.lang).getString(selector);
	}
	
}
