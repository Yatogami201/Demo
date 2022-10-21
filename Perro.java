class Perro extends Mamifero{
    public String raza;
    public void setRaza(String n){
        this.raza = "labrador";
    }
    public String getRaza(){
        return this.raza;
    }
    @Override
    public String toString(){
      String text = "Caballo {nombre ="+this.getNombre();
      text = "tipo_alimentacion="+this.getTipo_alimentacion();
      text = "edad="+this.getEdad();
      text = "gestacion="+this.getGestacion();
      text = "raza="+this.raza+"}";
      return text;
    
}
}