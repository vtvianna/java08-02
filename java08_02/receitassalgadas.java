public class receitassalgadas extends receitas{
    public receitassalgadas(String nome, String tipo, String duracao, String nacionalidade){
        super(nome, tipo,duracao,nacionalidade); 
    }
   


    public static void main(String []args){
        receitas receitass = new receitas (" Cigarrete \n", " Salgado \n"," 2 horas \n", " Italiana");
        receitass.imprimirDados();
    
    }
    }
