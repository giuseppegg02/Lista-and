public class Lista
{    
    public static void ol (String s) {System.out.println (s);}
    Nodo testa; 
    public Lista () 
    {
    
    }
    public Lista (Nodo t)
    { 
        testa = t;    
    }    
    public Nodo getTesta ()
    {                 
        Nodo n = testa;
        return n;         
    }
    public void aggiungiInTesta (Nodo n)
    {
        n.setSuccessivo (testa);
        testa = n;
    }
    public void cancellaInTesta ()
    {                  
        if (testa != null)
              testa = testa.getSuccessivo ();        
    } 
    public Nodo getCoda ()
    {
        Nodo n = testa;
        if (testa != null)
        {
            while (n.getSuccessivo () != null)
            {
                n = n.getSuccessivo ();
            }
            return n;
        }
        else
            return null;
    }
    public void aggiungiInCoda (Nodo n)
    {
        if (testa == null)
            testa = n;
        else
            getCoda ().setSuccessivo (n);
    }
    public void cancellaInCoda ()
    {
        if (testa != null)
            if (testa.getSuccessivo () == null)
                testa = null;
            else
            {
                Nodo n = testa;
                while (n.getSuccessivo ().getSuccessivo () != null)
                    n = n.getSuccessivo ();
                n.setSuccessivo (null);
            }                  
    }
    public int numeroElementi ()
    {
        Nodo n = testa;
        if (testa != null)
        {
            int i=1;
            while (n.getSuccessivo () != null)
            {
                n = n.getSuccessivo ();
                i++;
            }
            return i;
        }
        else
            return 0;
    }
    public void cercaInPosizione (int pos) 
    {
        if (testa != null && pos <= numeroElementi ())
        {
            Nodo n = testa;
            for (int i=1; i<pos; i++)
                n = n.getSuccessivo ();
            n.vedi ();            
        }
        else
            ol ("POSIZIONE VUOTA");
    }  
    public void visuaLista ()
    {
        if (testa != null)
        {        
            Nodo n = testa;
            n.vedi ();  // leggi testa
            while (n.getSuccessivo () != null)
            {
                n = n.getSuccessivo ();   
                n.vedi ();  // leggi nodo                    
            } 
        }
        else
            ol ("LA LISTA E' VUOTA");
    }
    public void aggiungiInPosizione (int pos, Nodo a)
    {
        if (testa != null)
        {   
            if (pos == 1)
            {
                aggiungiInTesta (a);
                return;
            }
            int num = numeroElementi();
            if (num>pos-1)
            {
                Nodo n = testa;
                for (int i=1; i<numeroElementi(); i++)
                {                    
                    if (i == pos-1)
                    {
                        Nodo t = n.getSuccessivo ();
                        n.setSuccessivo (a);                         
                        a.setSuccessivo (t);      
                        return;
                    }
                    else
                    {                        
                        n = n.getSuccessivo ();
                    }
                }
            }
            else
            {
                ol ("LA POSIZIONE SUPERA IL NUMERO MASSIMO DEGLI ELEMENTI. ALUNNO INSERITO IN CODA!");
                aggiungiInCoda (a);
            }
        }
        else if (pos == 1)        
            aggiungiInTesta (a);                        
        else
            ol ("LA LISTA E' VUOTA");           
    }
}