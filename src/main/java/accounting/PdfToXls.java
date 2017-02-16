package accounting;

import java.io.File;
import java.util.List;

import models.VolEntry;

public class PdfToXls {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Please provide the complete path to the PDF file.");
			return;
		}
		String filepath = args[0];
		File file = new File(filepath);
		String location = filepath.substring(0, filepath.lastIndexOf(File.separator));
		String inFile = file.getName();
		String outFile = inFile.substring(0, inFile.lastIndexOf(".")) + ".xls";
		System.out.println("Input: " + filepath);
		System.out.println("Now processing PDF file");
		String text = PDFReader.readPDF(filepath);
		List<VolEntry> entries = VolumeParser.getEntries(text);
		String xlsPath = location + File.separator + outFile;
		System.out.println("Creating output file..");
		VolumeParser.createXls(entries, xlsPath);
		System.out.println(xlsPath + " created.");
	}

}
