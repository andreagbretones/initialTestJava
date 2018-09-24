public class Disco {
    private String titulo;
    private String artista;
    private int numTemas;
    private float duracion;


    public Disco(String titulo, String artista, int numTemas, float duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.numTemas = numTemas;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumTemas() {
        return numTemas;
    }

    public void setNumTemas(int numTemas) {
        this.numTemas = numTemas;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
}

