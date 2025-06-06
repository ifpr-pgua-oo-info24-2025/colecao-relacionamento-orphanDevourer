import  java.util.ArrayList;

public class main {
     
    public static void main(String[] args) {
        ArrayList<livro> library = new ArrayList<>();

        autor autor1 = new autor("Saturn" ,"American");
        autor autor2 = new autor("Osquinn" , "Half-breed");

        livroDig livro1 = new livroDig( "Exaggerated (No prospects)" , "2020", autor1 );
        livro1.setTamFileMB(6.9);
        livroFis livro2 = new livroFis("Bad ideia" , "2020", autor2 );
        livro2.setPageN(900);

        library.add(livro2);
        library.add(livro1);

        for(livro livro : library) {
            System.out.println(livro.show());
            System.out.println("==================");
        }
    }
}