package accounting;

import java.util.List;

import models.VolEntry;

public class PdfToTsv {

	public static void main(String[] args) {
		String path = "C://Users//Oscar//Desktop//Wire_Detail.pdf";
		String text = PDFReader.readPDF(path);
		List<VolEntry> entries = VolumeParser.getEntries(text);
		String csvPath = "C://Users//Oscar//Desktop//Wire_Detail.tsv";
		VolumeParser.createTSV(entries, csvPath);
	}

}
