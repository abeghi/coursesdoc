
/**
 * Aggiungi qui una descrizione della classe Part2
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        //String result = "";
        String dnaLower = dna.toLowerCase();
        String startCodonLower = startCodon.toLowerCase();
        String stopCodonLower = stopCodon.toLowerCase();
        String dnaUpper = dna.toUpperCase();
        String startCodonUpper = startCodon.toUpperCase();
        String stopCodonUpper = stopCodon.toUpperCase();
        
        if (dna == dnaLower) {
            
            int startIndex = dna.indexOf(startCodonLower);
            if (startIndex == -1){
                //return "The dna string contains no genes, as no start codon ATG was found";
                return "";
            }
            
            int stopIndex = dna.indexOf(stopCodonLower, startIndex+3);
            if (stopIndex == -1){
                //return "The dna string contains no genes, as no stop codon TAA was found";
                return "";
            }

            String gene = dnaLower.substring(startIndex, stopIndex+3);
            int geneLength = gene.length();
            if (geneLength % 3 == 0) {
                return gene;
            }

        }
            
        if (dna == dnaUpper) {
            
            int startIndex = dna.indexOf(startCodonUpper);
            if (startIndex == -1){
                //return "The dna string contains no genes, as no start codon ATG was found";
                return "";
            }
            
            int stopIndex = dna.indexOf(stopCodonUpper, startIndex+3);
            if (stopIndex == -1){
                //return "The dna string contains no genes, as no stop codon TAA was found";
                return "";
            }
            
            String gene = dnaUpper.substring(startIndex, stopIndex+3);
            int geneLength = gene.length();
            if (geneLength % 3 == 0) {
                return gene;
            }
        }
                
        return "";
    }
    
    public void testSimpleGene() {
        String dna = "ATAAGGCTAAACT";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        dna = "ATAAAAATGCTAACGGGTATGAA";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        dna = "ATAAGTGTGTGAAAGAGAGAGTG";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
        //dna = "AGGAATGGATATATGGTGAATATAAAAT";
        dna = "aggaatggatatatggtgaatataaat";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna, "ATG", "TAA");        
        System.out.println("Gene is " + gene);
        
        //dna = "AGGAATGGATGTGTGAGTAA";
        dna = "aggaatggatgtgtgagtaa";
        System.out.println("DNA strand is " + dna);        
        gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        
    }

}
