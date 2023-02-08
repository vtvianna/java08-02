public class receitasdoce extends receitas{
    public receitasdoce(String nome, String tipo, String duracao, String nacionalidade){
        super(nome, tipo,duracao,nacionalidade); 
    }
   


    public static void main(String []args){
        receitas receitass = new receitas (" Brigadeiro \n", " Doce \n"," 40 minutos \n", " Brasileira ");
        receitass.imprimirDados();
    
    }
    }