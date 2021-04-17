/*
 */
package verma.com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtil {

    public static LoginVO getLoginObj() {
        LoginVO login = null;
        // any time we use FileInput, we have to use try catch method
        try {
            //read excel file     this line is the boilor plate    
            FileInputStream inputStream = new FileInputStream(new File("c:\\data\\ikeaproject.xlsx"));

            Workbook workbook = new XSSFWorkbook(inputStream);
            //getting first worksheet         
            Sheet firstSheet = workbook.getSheetAt(0);
            //get first row        
            Row r = firstSheet.getRow(1);
            Cell c = r.getCell(0); //username value      
            String username = c.getStringCellValue();
            c = r.getCell(1); //password        
            String password = c.getStringCellValue();
            c = r.getCell(2); // title
            String title = c.getStringCellValue();
            login = new LoginVO(username, password, title);
            System.out.println(login);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return login;
    }
// In order to test Util mtd, we need to create main mtd

    public static void main(String args[]) {
        FileUtil.getLoginObj();  //here FileUtil is the class and .getLoginData is the method
    }  //FileUtil.getLoginData(); <- this method if going to call in line 23 -> inputStream
}
