
/**
 * Aggiungi qui una descrizione della classe Part3
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Part3 {
    public String twoOccurrences(String stringa, String stringb) {
        // metodo 
        int stringIndex = stringb.indexOf(stringa);
        int string2Index = stringb.indexOf(stringa, stringIndex+stringa.length());
        
        if ((stringIndex < 0 || string2Index < 0)) { 
            return "false";
        }
                
        return "true";
    }
    
    public void twoTesting() {
        String stringa = "Da";
        String stringb = "Davide Damasco Dark";
        System.out.println("Strings are " + stringa + " and " + stringb);
        String occurrences = twoOccurrences(stringa, stringb);
        if (occurrences == "true"){
            System.out.println("More than 2 occurrences");
        }
        else {
            System.out.println("Less than 2");
        }
        
        stringa = "a";
        stringb = "banana cazzo";
        System.out.println("Strings are " + stringa + " and " + stringb);
        occurrences = twoOccurrences(stringa, stringb);
        if (occurrences == "true"){
            System.out.println("More than 2 occurrences");
        }
        else {
            System.out.println("Less than 2");
        }

        
        stringa = "aba";
        stringb = "abaco";
        System.out.println("Strings are " + stringa + " and " + stringb);
        occurrences = twoOccurrences(stringa, stringb);
        if (occurrences == "true"){
            System.out.println("More than 2 occurrences");
        }
        else {
            System.out.println("Less than 2");
        }

        
        stringa = "can";
        stringb = "vaccaoijsdijfiojcan";
        System.out.println("Strings are " + stringa + " and " + stringb);
        occurrences = twoOccurrences(stringa, stringb);
        if (occurrences == "true"){
            System.out.println("More than 2 occurrences");
        }
        else {
            System.out.println("Less than 2");
        }

        
    }
    
    public String lastPart (String stringa, String stringb) {
        int stringbIndex = stringb.indexOf(stringa);
        if (stringbIndex == -1) {
            return stringb;
        }
        else {
            String secondPart = stringb.substring(stringbIndex+stringa.length());
            return secondPart;
        }
    }
    
    public void partTesting(){
        String stringa = "avol";
        String stringb = "sfoihavolpartefinale";
        System.out.println("The part of the string after " + stringa + " in " + stringb + " is " + lastPart(stringa, stringb));
        
        stringa = "cane";
        stringb = "iausdhojcane ciao";
        System.out.println("The part of the string after " + stringa + " in " + stringb + " is " + lastPart(stringa, stringb));
        
        stringa = "uffa";
        stringb = "sduhfuhuffabrusi ti amo";
        System.out.println("The part of the string after " + stringa + " in " + stringb + " is " + lastPart(stringa, stringb));
        
        stringa = "che due palle";
        stringb = "sudjoifj che due palle uffa";
        System.out.println("The part of the string after " + stringa + " in " + stringb + " is " + lastPart(stringa, stringb));
        
    }

}
