
/**
 * Aggiungi qui una descrizione della classe Part1
 * 
 * @author (beghia) 
 * @version (un numero di versione o una data)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        //String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){
            //return "The dna string contains no genes, as no start codon ATG was found";
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if (stopIndex == -1){
            //return "The dna string contains no genes, as no stop codon TAA was found";
            return "";
        }
        
        String gene = dna.substring(startIndex, stopIndex+3);
        int geneLength = gene.length();
        if (geneLength % 3 == 0) {
            return gene;
        }
        
        return "";
    }
    
    public void testSimpleGene() {
        String dna = "ATAAGGCTAAACT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATAAAAATGCTAACGGGTATGAA";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "ATAAGTGTGTGAAAGAGAGAGTG";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "AGGAATGGATATATGGTGAATATAAAAT";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna);        
        System.out.println("Gene is " + gene);
        
        dna = "AGGAATGGATGTGTGAGTAA";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
    }

}
