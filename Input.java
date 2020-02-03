import java.io.*;
public class Input // classe per input da tastiera
{
    BufferedReader reader;
    public Input ()
    {
        reader = new BufferedReader (new InputStreamReader (System.in));
    }
    public int readInt () throws IOException // input di un intero
    {
        return Integer.parseInt (reader.readLine ());
    }
    public double readDouble () throws IOException // input di un double
    {
        return Double.parseDouble (reader.readLine ());
    }
    public String readLine () throws IOException // input di una stringa
    {
        return reader.readLine ();
    }
}