public class Bebe {
    String nombre;

    public Bebe(String nombre) {
        this.nombre = nombre;
    }

    public Bebe() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Hablar()
    {
        System.out.println("Soy un bebe y digo mucho "+nombre);
    }


}
