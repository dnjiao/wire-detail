package accounting;

import java.util.ArrayList;
import java.util.List;

import models.VolEntry;

public class VolumeParser {
	public static List<VolEntry> getEntries(String text) {
		List<VolEntry> entries = new ArrayList<VolEntry>();
		String[] lines = text.split("\\r?\\n");
		return entries;
	}

}
