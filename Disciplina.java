public class Disciplina{
   private String nome2;
   private boolean pratica;
   
   public Disciplina(String nome2, boolean pratica){
      this.nome2 = nome2;
      this.pratica = pratica;
   }
   public String getNome2(){
      return nome2;
   }
   public boolean getPratica(){
      return pratica;
   }
   public void setNome2(String nome2){
      this.nome2 = nome2;
   }
   public void setPratica(boolean pratica){
      this.pratica = pratica;
   }
   public String getDados(){
      return " nome: " +nome2 + ", pratica: " + pratica;
   }
}