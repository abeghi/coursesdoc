
/**
 * Aggiungi qui una descrizione della classe FindGeneSimple
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class FindGeneSimpleAndTest {
    public String findGeneSimple(String dna) {
        // start codon is "ATG"
        // stop codon is "TAA"
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) //no ATG
        {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1) //no TAA
        {
            return "";
        }
        result = dna.substring(startIndex, stopIndex+3);
        
        // if ((stopIndex - startIndex) % 3 == 0))
        // {
        //    return result;
        //}
       
        return "not a valid gene";
    
    }
    
    public void testFindGeneSimple() {
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
    }

}
