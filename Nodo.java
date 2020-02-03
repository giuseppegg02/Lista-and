public class Nodo
{
    public static void ol (String s) {System.out.println (s);}
    private Alunno info;
    private Nodo successivo;  
    public Nodo ()
    {

    }
    public Nodo (Alunno info)
    {
        this.info = info;
    }
    public Nodo (Alunno info, Nodo successivo)
    {
        this.info = info;
        this.successivo = successivo;
    }
    public void setInfo (Alunno info) {this.info = info;}
    public void setSuccessivo (Nodo n) {successivo = n;}
    public Alunno getInfo () {return info;} 
    public Nodo getSuccessivo () {return successivo;}    
    public void vedi ()
    {
        ol (info.toString());
    }
}