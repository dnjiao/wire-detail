# Automated Program to process wire details
Convert PDF to Excel

It has been tested on Windows 7 with Java 8

### Instruction
1. Download volume.jar and put in on Desktop or any directory.
2. Launch cmd from Start.
3. The default path should be C:\Users\[username]
4. Change directory to where the volume.jar is
    
    `cd Desktop`
5. Get the path of input PDF file. Navigate to the folder where the file is located, right click on the file, 
go to __Properties__ and copy the __Location__
6. Type the following command in cmd. If the pdf is not in Desktop, replace the path to the correct location.

    `java -cp volume.jar accounting.PdfToXls C:\Users\[username]\Desktop\wire_detail.pdf`                

7. A new Excel file named `wire_detail.xls` will be created in the same directory of the pdf.
 
