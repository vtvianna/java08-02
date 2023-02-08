public class receitas{
    private String nome,tipo,Duracao, nacionalidade;
    

    public receitas(String nome, String tipo,String Duracao, String nacionalidade){
        this.nome=nome;
        this.tipo=tipo;
        this.Duracao=Duracao;
        this.nacionalidade=nacionalidade;

    }
    public void imprimirDados(){
        System.out.println("Nome da Receita:" +  nome +  "Tipo da Receita:"  + tipo +  "Duração da Receita:"  + Duracao  + "Nacionalidade da Receita:"  + nacionalidade );

    }

        public static void main(String []args){
            receitas receitass = new receitas (" Pizza \n", " Salgada \n"," 3 horas \n", "Italiana");
            receitass.imprimirDados();
        
        }

    }