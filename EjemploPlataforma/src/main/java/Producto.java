public class Producto {

    private String nombre;
    private int precio;
    private String marca;
    private String color;

    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.marca = "";
        this.color = "";
    }

    public Producto(String nombre, int precio, String marca, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
