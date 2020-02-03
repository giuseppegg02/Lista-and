public class Alunno
{    
    private String nome;
    private String cognome;
    private String classe;      
    public Alunno () 
    {
    
    }
    public Alunno (String nome, String cognome, String classe)
    {
       this.nome = nome;
       this.cognome = cognome;
       this.classe = classe;
    }
    public void setNome    (String n)  {nome = n;} 
    public void setCognome (String c)  {cognome = c;}
    public void setClasse  (String c)  {classe = c;}
    public String getNome     ()       {return nome;}
    public String getCognome  ()       {return cognome;}
    public String getClasse   ()       {return classe;}   
    public String toString    ()       {return nome + ", " + cognome + ", " + classe;}
}