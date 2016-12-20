
/**
 * Aggiungi qui una descrizione della classe Part4
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import edu.duke.*;

public class Part4 {
    public void findYouTube() {
        URLResource res = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String line : res.lines()){
            String lineLower = line.toLowerCase();
            int youtubePresent = lineLower.indexOf("youtube");
            if (youtubePresent > -1) {
                String linkIdentifier = "\"";
                int startLink = line.lastIndexOf(linkIdentifier,youtubePresent);
                int stopLink = line.indexOf(linkIdentifier,startLink+2);
                if (startLink > -1 && stopLink > -1){
                    String youtubeLink = line.substring(startLink, stopLink+1);
                    System.out.println(youtubeLink);
                }
                
            }

            //System.out.println(line);
        }
        
        
    }
    

}
