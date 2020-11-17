package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import oreilly.base.BaseClass;

public class TestUtils extends BaseClass{

	private static    XSSFWorkbook workbook;
	private static   XSSFSheet sheet;
	private static   XSSFCell cell;
	
	public TestUtils() throws IOException {
		super();
	}
	
	
    public static void TackScreen(String name) throws IOException {
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile,new File("D:\\oreilly\\screenshot\\"+name+".png"));
	
} 
    
    
    public static  Object[][] getSheetData(String Path,String SheetName) throws IOException{
    	 
    			 //check file path if error
    			  FileInputStream ExcelFile = new FileInputStream(new File (Path));
    			 //Apatch poi
    			  
    			  workbook = new XSSFWorkbook(ExcelFile);
    			  sheet = workbook.getSheet(SheetName);
    			  
    			  int row = sheet.getLastRowNum();
    			  int column = sheet.getRow(0).getLastCellNum();
    			  
    			  Object data[][] = new Object[row][column];
    			  
    			  for (int i =0 ; i<row ; i++) {
    				  for(int j = 0 ; j<column ; j++) {
    					  data [i][j] = sheet.getRow(i).getCell(j);
    				  }
    			  }
    			  ExcelFile.close();
    			  return data; 
    			     }
}

