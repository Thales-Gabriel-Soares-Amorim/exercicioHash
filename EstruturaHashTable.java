package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    public int EscolherIndice(int chave) {
     return chave % 1000;
    }
    
    @Override
    public boolean insert(int chave) {
    
    // numero que quero inserir
       int numero = EscolherIndice(chave);
       //ifs verificam
       if (tabela[numero] != null){ 
        return false;
       }
        tabela[numero] = chave; //inserção
        return true;
       }
    

    @Override
    public boolean delete(int chave) {
        int numero = EscolherIndice(chave);
        if (tabela[numero] != null){
            tabela[numero] = null; //o numero foise
            return true;

        }
        return false; // não havia numero para apagar
        
    }

    @Override
    public boolean search(int chave) {
        int numero = EscolherIndice(chave);
        if (tabela[numero] != null &&  tabela[numero] == chave){
            return true; //encontrou
        } return false;
    }
    
}
