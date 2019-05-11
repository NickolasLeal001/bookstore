package bookstore;

public class Book {

    private String titulo;
    private long isbn;
    private float preco;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public long getISBN() {
        return isbn;
    }
    
    public void setISBN(long isbn) {
        this.isbn = isbn;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
