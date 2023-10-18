package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

public class PropertyHelpers {
    private static Properties properties;
    private static String linkFile;
    private static FileInputStream file;
    private static FileOutputStream out;
    private static String relPropertiesFilePathDefault = "src/test/resources/configs.properties";



    public static void setFile(String relPropertiesFilePath) {
        properties = new Properties();
        try {
            linkFile = System.getProperty("user.dir")+ File.separator + relPropertiesFilePath;
            file = new FileInputStream(linkFile);
            properties.load(file);
            file.close();
            System.out.println("Set Properties file: " + relPropertiesFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getValue(String key) {
        String value = null;
        try {
            if (file == null) {
                properties = new Properties();
                linkFile = System.getProperty("user.dir")+File.separator + relPropertiesFilePathDefault;
                file = new FileInputStream(linkFile);
                properties.load(file);
                file.close();
            }
            // Lấy giá trị từ file đã Set
            value = properties.getProperty(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return value;
    }

    public static void setValue(String key, String value) {
        try {
            if (file == null) {
                properties = new Properties();
                file = new FileInputStream(System.getProperty("user.dir") + relPropertiesFilePathDefault);
                properties.load(file);
                file.close();
                out = new FileOutputStream(System.getProperty("user.dir") + relPropertiesFilePathDefault);
            }
            //Ghi vào cùng file Prop với file lấy ra
            out = new FileOutputStream(linkFile);
            System.out.println(linkFile);
            properties.setProperty(key, value);
            properties.store(out, null);
            out.close();
            System.out.println("Set " + key + " = " + value + " to properties file successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
