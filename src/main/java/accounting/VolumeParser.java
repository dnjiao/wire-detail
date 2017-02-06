package accounting;

import java.util.ArrayList;
import java.util.List;

import models.VolEntry;

public class VolumeParser {
	public static List<VolEntry> getEntries(String text) {
		List<VolEntry> entries = new ArrayList<VolEntry>();
		String[] lines = text.split("\\r?\\n");
		boolean initFlag = false;
		for(String line: lines) {
			
			VolEntry volEntry;
			if (line.startsWith("***U")) {
				volEntry = new VolEntry();
				int firstSpace = line.indexOf(" ");
				int secondSpace = line.indexOf(" ", firstSpace + 1);
				volEntry.setVolNumber(line.substring(firstSpace + 1, secondSpace));
				int idxCounty = line.indexOf("COUNTY");
				volEntry.setVolName(line.substring(secondSpace + 1, idxCounty));
				int firstColon = line.indexOf(":", idxCounty);
				int endCounty = line.indexOf(" ", firstColon);
				volEntry.setCounty(line.substring(firstColon + 1, endCounty));
				int secondColon = line.indexOf(":", endCounty);
				volEntry.setState(line.substring(secondColon + 1).trim());
			}
			if (line.startsWith("W O")) {
				String[] items = line.trim().split(" +");
				double net;
				if (items.length == 6) {
					if (items[5].endsWith("-")) {
						net = Double.parseDouble(items[5].substring(0, items[5].indexOf('-'))) * (-1);
					} else {
						net = Double.parseDouble(items[5]);
					}
					volEntry.setNet(net);
				} else if (items.length == 8){
					volEntry.setUnit(Double.parseDouble(items[4]));
					volEntry.setVolume(Double.parseDouble(items[5]));
					volEntry.setNet(Double.parseDouble(items[6]));
				}
			}
			entries.add(volEntry);
		}
		return entries;
	}

}
