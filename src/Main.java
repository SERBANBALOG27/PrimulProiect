
public class Main{
    //definim functia de String
    public static String celMaiLungCuvant (String[] cuvinte)
    {
        String celMaiLung="";

        for (String  cuvant : cuvinte) {
            //face comparatie cu functia for cu .length
            if (cuvant.length() > celMaiLung.length()) {

                celMaiLung =cuvant;
            }
        } // tre sa returnam ceva in urma for-ului
        return celMaiLung;
    }
    public static void main(String[]args){

    String[] cuvinte = {"unu","treiCuvinte","douaCuvintele","patru","saptesuteoptzeci"};

    String lung = celMaiLungCuvant(cuvinte);

System.out.println("Cel mai lung cuvant este:" + lung);
}
}



