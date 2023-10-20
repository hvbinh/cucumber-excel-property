package runner;


import helpers.ExcelHelpers;
import helpers.PropertyHelpers;
import org.testng.annotations.Test;

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
}
