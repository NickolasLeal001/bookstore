package bookstore;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ShoppingCartTest {
    
    /**
     * Test of adicionarLivro method, of class ShoppingCart.
     */
    @Test
    public void testAdicionarLivro() {
        System.out.println("adicionarLivro");
        ArrayList<Book> arBK = new ArrayList<>();
        
        String titulo = "Os pedregulhos";
        long isbn = 2015045940;
        float preco = (float) 20.59;
        
        ShoppingCart.adicionarLivro(arBK,titulo,isbn,preco); //adiciona o primeiro livro
        String title_result = arBK.get(0).getTitulo();
        
        assertEquals(title_result, titulo);
    }

    /**
     * Test of retornaQuantidade method, of class ShoppingCart.
     */
    @Test
    public void testRetornaQuantidade() {
        System.out.println("retornaQuantidade");
        ArrayList<Book> arBK = new ArrayList<>();
        
        String titulo = "Os pedregulhos";
        long isbn = 2015045940;
        float preco = (float) 20.59;
        ShoppingCart.adicionarLivro(arBK,titulo,isbn,preco); //adiciona o primeiro livro
        
        String titulo2 = "Os riachos";
        long isbn2 = 2014541849;
        float preco2 = (float) 85.59;
        ShoppingCart.adicionarLivro(arBK,titulo2,isbn2,preco2); //adiciona o segundo livro
        
        String titulo3 = "Os animais";
        long isbn3 = 2010544602;
        float preco3 = (float) 13.59;
        ShoppingCart.adicionarLivro(arBK,titulo3,isbn3,preco3); //adiciona o terceiro livro
        
        int expResult = 3;
        int result = ShoppingCart.retornaQuantidade(arBK);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeLivro method, of class ShoppingCart.
     */
    @Test
    public void testRemoveLivro() {
        System.out.println("removeLivro");
        ArrayList<Book> arBK = new ArrayList<>();
        
        String titulo = "Os pedregulhos";
        long isbn = 2015045940;
        float preco = (float) 20.59;
        ShoppingCart.adicionarLivro(arBK,titulo,isbn,preco); //adiciona o primeiro livro
        
        String titulo2 = "Os riachos";
        long isbn2 = 2014541849;
        float preco2 = (float) 85.59;
        ShoppingCart.adicionarLivro(arBK,titulo2,isbn2,preco2); //adiciona o segundo livro
        
        String titulo3 = "Os animais";
        long isbn3 = 2010544602;
        float preco3 = (float) 13.59;
        ShoppingCart.adicionarLivro(arBK,titulo3,isbn3,preco3); //adiciona o terceiro livro
        
        ShoppingCart.removeLivro(arBK, isbn3);
        
        int expResult = 2;
        int result = ShoppingCart.retornaQuantidade(arBK);
        assertEquals(expResult, result);
    }

    /**
     * Test of esvaziarCarrinho method, of class ShoppingCart.
     */
    @Test
    public void testEsvaziarCarrinho() {
        System.out.println("esvaziarCarrinho");
        ArrayList<Book> arBK = new ArrayList<>();
        
        String titulo = "Os pedregulhos";
        long isbn = 2015045940;
        float preco = (float) 20.59;
        ShoppingCart.adicionarLivro(arBK,titulo,isbn,preco); //adiciona o primeiro livro
        
        String titulo2 = "Os riachos";
        long isbn2 = 2014541849;
        float preco2 = (float) 85.59;
        ShoppingCart.adicionarLivro(arBK,titulo2,isbn2,preco2); //adiciona o segundo livro
        
        String titulo3 = "Os animais";
        long isbn3 = 2010544602;
        float preco3 = (float) 13.59;
        ShoppingCart.adicionarLivro(arBK,titulo3,isbn3,preco3); //adiciona o terceiro livro
        
        ShoppingCart.esvaziarCarrinho(arBK);
        
        int expResult = 0;
        int result = ShoppingCart.retornaQuantidade(arBK);
        assertEquals(expResult, result);     
    }

    /**
     * Test of precoTotal method, of class ShoppingCart.
     */
    @Test
    public void testPrecoTotal() {
        System.out.println("precoTotal");
        ArrayList<Book> arBK = new ArrayList<>();
        
        String titulo = "Os pedregulhos";
        long isbn = 2015045940;
        float preco = (float) 20.59;
        ShoppingCart.adicionarLivro(arBK,titulo,isbn,preco); //adiciona o primeiro livro
        
        String titulo2 = "Os riachos";
        long isbn2 = 2014541849;
        float preco2 = (float) 85.59;
        ShoppingCart.adicionarLivro(arBK,titulo2,isbn2,preco2); //adiciona o segundo livro
        
        String titulo3 = "Os animais";
        long isbn3 = 2010544602;
        float preco3 = (float) 13.59;
        ShoppingCart.adicionarLivro(arBK,titulo3,isbn3,preco3); //adiciona o terceiro livro
        
        float expResult = (float) 119.76999;
        float result = ShoppingCart.precoTotal(arBK);
        assertEquals(expResult, result, 0.0);
    }
    
    //@Test
    //    public void testFooThrowsIndexOutOfBoundsException(){
    //    assertThrows(IndexOutOfBoundsException.class, foo.doStuff());
    //}
    
}
