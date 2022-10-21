public class Animal
{
  public String nombre;
  public String tipo_alimentacion;
  public int edad;
  public void setNombre(String n){
      this.nombre = n;
    }
  public String getNombre(){
    return this.nombre;
  }
  
  public void setTipo_alimentacion(String n){
    this.tipo_alimentacion = n;
  }
  public String getTipo_alimentacion(){
    return this.tipo_alimentacion;
  }
  public void setEdad(int n){
        this.edad = n;
    }
  public int getEdad(){
        return this.edad;
    }
    }