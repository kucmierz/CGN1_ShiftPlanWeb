package shiftplan.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Setting {
	public static Properties wczytaj() {
		Properties p = new Properties();
				
		try (InputStream in = Setting.class
				.getResourceAsStream("/settings.properties")) {
			p.load(in);
		} catch (IOException e) {
			System.err.println("Nie mogę załadować properties " + e);
		}
		return p;
	}
}
