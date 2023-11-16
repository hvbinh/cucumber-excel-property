package runner;


import helpers.ExcelHelpers;
import helpers.PropertyHelpers;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    @Test
    public void tc1()
    {
        PropertyHelpers.setFile("src/test/resources/config/config.properties");
        System.out.println(PropertyHelpers.getValue("USER_NAME"));
        System.out.println(PropertyHelpers.getValue("PASSWORD"));

    }
    @Test
    public void tc2()
    {
        ExcelHelpers helpers = new ExcelHelpers();
        helpers.setExcelFile("src/test/resources/data/datatest.xlsx","login");
        System.out.println(helpers.getCellData(1,0));
        System.out.println(helpers.getCellData(1,1));
        System.out.println(helpers.getCellData(2,0));
        System.out.println(helpers.getCellData(2,1));

    }
    @Test
    public void tc3() throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("MM-dd-yyyy");
        Date currentDate = new Date();
        System.out.println(formatDate.format(currentDate));

    }
}
