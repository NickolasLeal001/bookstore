package bookstore;

import java.util.ArrayList;

public class ShoppingCart {

    public static void adicionarLivro(ArrayList<Book> arBK,String titulo, long isbn, float preco){
        
        int tamanho = arBK.size();
        
        Book BK = new Book();
        
        BK.setTitulo(titulo);
        BK.setISBN(isbn);
        BK.setPreco(preco);
        
        arBK.add(tamanho, BK);
        
    }
    
    public static void removeLivro(ArrayList<Book> arBK, long isbn){
        
        for(int i = 0; i < arBK.size(); i++)
        {
            Book p = arBK.get(i);

            if(p.getISBN() == isbn)
            {
                arBK.remove(p);
                break;
            }
        }
    }
    
    public static void esvaziarCarrinho(ArrayList<Book> arBK){  
        arBK.clear();
    }
    
    public static int retornaQuantidade(ArrayList<Book> arBK){
        return arBK.size();
    }
    
    public static float precoTotal(ArrayList<Book> arBK){
        int total_books = arBK.size();
        float preco = 0;
        
        for (int i=0; i<total_books; i++){
            preco = preco + arBK.get(i).getPreco();
        }
        
        return preco;
    }
    
}
