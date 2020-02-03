public class Menu
{
    public static void o  (String s) {System.out.print   (s);}
    public static void ol (String s) {System.out.println (s);}
    public static void main (String args []) throws Exception
    {
       Alunno a = new Alunno ();       
       Input in = new Input  ();
       Lista l  = new Lista  ();
       // Nodo nd  = new Nodo   ();         
       String n,c,cl;
       boolean ok = false;
       int s=0, pos;  
       do {
           ol ("MENU' ALUNNI");
           ol ("0) ESCI");
           ol ("1) INSERISCI ALUNNO IN TESTA");
           ol ("2) INSERISCI ALUNNO IN CODA");
           ol ("3) ELIMINA ALUNNO IN TESTA");
           ol ("4) ELIMINA ALUNNO IN CODA");   
           ol ("5) VISUALIZZA ALUNNI");   
           ol ("6) VISUALIZZA NUMERO ALUNNI");   
           ol ("7) VISUALIZZA ALUNNO TRAMITE POSIZIONE");   
           ol ("8) AGGIUNGI ALUNNO IN POSIZIONE");
           // ol ("9) ELIMINA ALUNNO IN POSIZIONE");
           o ("SCELTA: ");  s = in.readInt ();   
           if (s == 1 || s == 2 || s==8)
           {
               o ("NOME: ");       n  = in.readLine ();
               o ("COGNOME: ");    c  = in.readLine ();
               o ("CLASSE: ");     cl = in.readLine ();
               a  = new Alunno (n,c,cl);
               // nd = new Nodo (a);              
           }
           switch (s)
           {
               case 0:  break;
               case 1:  l.aggiungiInTesta (new Nodo (a));   // (nd)
                        break;
               case 2:  l.aggiungiInCoda (new Nodo (a));    // (nd)
                        break;
               case 3:  l.cancellaInTesta ();
                        break;
               case 4:  l.cancellaInCoda ();
                        break;      
               case 5:  l.visuaLista ();
                        break;
               case 6:  int num = l.numeroElementi ();
                        ol ("ALUNNI: " + num);
                        break;
               case 7:  pos = 0;
                        do { 
                            o ("POSIZIONE ALUNNO DESIDERATO: ");
                            pos = in.readInt ();
                            if (pos<1)
                                ol ("INSERIRE VALORE VALIDO");
                        } while (pos<1); 
                        l.cercaInPosizione (pos);
                        break;
               case 8:  pos = 0;
                        do { 
                            o ("POSIZIONE ALUNNO DESIDERATO: ");
                            pos = in.readInt ();
                            if (pos<1)
                                ol ("INSERIRE VALORE VALIDO");
                        } while (pos<1);
                        l.aggiungiInPosizione (pos,new Nodo (a));
                        break;
               default: ol ("ERRORE. INSERIRE UN VALORE TRA 0 E 7");
                        break;        
           }
       } while (s != 0);
    }   
}