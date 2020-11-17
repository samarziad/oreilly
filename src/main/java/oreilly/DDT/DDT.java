package oreilly.DDT;


import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DDT {
	private static    XSSFWorkbook workbook;
	private static   XSSFSheet sheet;
	private static   XSSFCell cell;

	
	    
 public static void setExcelFile(String Path,String SheetName) throws Exception {
	    	 
	        try {
	 //check file path if error
	  FileInputStream ExcelFile = new FileInputStream(new File (Path));
	 //Apatch poi
	  
	  workbook = new XSSFWorkbook(ExcelFile);
	  sheet = workbook.getSheet(SheetName);
	  //by sheet order 
	  //sheet = workbook.getSheetAt(0);
	  
	  } catch (Exception e){
	  
	  throw (e);
	  
	  }
 }
 
 public  String getCellData(int RowNum, int ColNum) throws Exception{
	 try{
	      
	     cell = sheet.getRow(RowNum).getCell(ColNum);
	      
	     String CellData = cell.getStringCellValue();
	      
	     return CellData;
	      
	     }catch (Exception e){
	      
	      return e.getMessage();
	      
	           }
	      
	     }
	      

	        

 }
