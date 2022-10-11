
public class Cliente {
    private String nombre;
    private String cedula;
    boolean discapacidad;

    public Cliente(String nombre,String cedula,boolean discapacidad){
        this.nombre=nombre;
        this.cedula=cedula;
        this.discapacidad=discapacidad;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\tCedula: "+cedula+"\tDiscapacidad: "+discapacidad;
    }
}

