

public static void main(){
	
	Document document = new Document();
	PdfWriter.getInstance(document, new FileOutputStream("C:\\itext\\ites.pdf"));		document.open();
	// copy from windows/font
	BaseFont f1 = BaseFont.createFont("src/main/resources/ARIAL.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
	Font font = new Font(f1, 30, Font.NORMAL);
	System.out.println((new String("???????".getBytes("Cp1251"), "Windows-1251")));
	document.add(new Paragraph(new String("???????".getBytes("Cp1251"), "Windows-1251"), font));
	document.close();
}