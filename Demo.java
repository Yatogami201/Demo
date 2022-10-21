public class Demo{
    public static void main(String[]args){

       Perro a = new Perro();

       a.setNombre ("Pedro");
       a.setTipo_alimentacion ("Carnivoro");
       a.setEdad (2);
       a.setGestacion (0);
       a.setRaza ("Labrador");

       System.out.println(a.getNombre());
       System.out.println(a.getTipo_alimentacion());
       System.out.println(a.getEdad());
       System.out.println(a.getGestacion());
       System.out.println(a.getRaza());

       Caballo b = new Caballo();

            b.setNombre("Juan");
            b.setTipo_alimentacion("Herbivoro");
            b.setEdad(3);
            b.setGestacion(2);
            b.setComida("Heno");
            b.setEjercicio(4);

            System.out.println(b.getNombre());
            System.out.println(b.getTipo_alimentacion());
            System.out.println(b.getEdad());
            System.out.println(b.getGestacion());
            System.out.println(b.getComida());
            System.out.println(b.getEjercicio());
       
       

    }
    
    }


