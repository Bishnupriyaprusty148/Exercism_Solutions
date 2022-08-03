class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuffer sb = new StringBuffer();
        char rna = ' ';
        for(int i=0;i<dnaStrand.length();i++)
        {
            char ch = dnaStrand.charAt(i);
            switch(ch)
                {
                    case 'A':
                        rna='U';
                        break;
                    case 'C':
                        rna='G';
                        break;
                    case 'T':
                        rna='A';
                        break;
                    case 'G':
                        rna='C';
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input");
                }

            sb.append(rna);
        }
        return sb.toString();

}
}
