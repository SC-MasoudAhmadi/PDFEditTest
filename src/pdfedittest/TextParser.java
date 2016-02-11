
package pdfedittest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.spi.CharsetProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class TextParser {
    private String _FilePath;
    public TextParser(String filePath){
        _FilePath = filePath;
    }
    
    public void getUserDetail(String userFullName)
    {
        try
        {
            String fileContent = readFile(userFullName);
            ArrayList<String> faRows = getIndividualFArow(fileContent);
            
        }catch(IOException io) {
            return;
        }
                
        
        
        //get start&end date
        //getindividualFASeciton
        //parse FA calander obj
        //read flight schedule table
        //print data        
    }
    
    private ArrayList<String> getIndividualFArow(String fileContent)
    {
        ArrayList<String> faList = new ArrayList<String>();
        String pattern = "\\A\\bFA\\b(*)\\z\\bFA\\b";
        
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(fileContent);
        
        if(m.find()){
            for (int i=1;i<m.groupCount();i++) {
                System.out.println(m.group(i));
            }
        }
        return null;
    }
    
  static String readFile(String path) throws IOException 
  {
    return new String(Files.readAllBytes(Paths.get(path)));
  }
    
}
