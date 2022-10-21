class Caballo extends Mamifero{
    public String comida;
    public int ejercicio;
    public void setComida(String n){
        this.comida = n;
    }
    public String getComida(){
        return this.comida;
    }
    public void setEjercicio(int n){
        this.ejercicio = n;
    }
    public int getEjercicio(){
        return this.ejercicio;
    }
  @Override
  public String toString(){
    String text = "Caballo {nombre ="+this.getNombre();
    text = "tipo_alimentacion="+this.getTipo_alimentacion();
    text = "edad="+this.getEdad();
    text = "gestacion="+this.getGestacion();
    text = "comida="+this.getComida();
    text = "ejercicio="+this.ejercicio+"}";
    return text;
  }
  
}